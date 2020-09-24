package io.httpsdownload;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;

/**
 * 实现https请求，可用于加载https路径的存储图片，避开信任证书的验证。
 *
 * @author xiaoboji
 */
public class HttpsUtils {

  /**
   * method1:下载文件到本地
   *
   * @param fileUrl 远程地址
   * @param fileLocal 本地路径
   * @throws Exception
   */
  public static File downloadFile(String fileUrl, String fileLocal) throws IOException {
    // 对本地文件进行命名
    File file = new File(fileLocal);

    SSLContext sslcontext = null;
    try {
      sslcontext = SSLContext.getInstance("SSL", "SunJSSE");
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (NoSuchProviderException e) {
      e.printStackTrace();
    }
    try {
      sslcontext.init(
          null, new TrustManager[] {new X509TrustUtiil()}, new java.security.SecureRandom());
    } catch (KeyManagementException e) {
      e.printStackTrace();
    }
    URL url = new URL(fileUrl);
    HostnameVerifier ignoreHostnameVerifier =
        new HostnameVerifier() {
          @Override
          public boolean verify(String s, SSLSession sslsession) {
            System.out.println("WARNING: Hostname is not matched for cert.");
            return true;
          }
        };
    HttpsURLConnection.setDefaultHostnameVerifier(ignoreHostnameVerifier);
    HttpsURLConnection.setDefaultSSLSocketFactory(sslcontext.getSocketFactory());
    HttpsURLConnection urlCon = (HttpsURLConnection) url.openConnection();
    urlCon.setConnectTimeout(6000);
    urlCon.setReadTimeout(6000);
    int code = urlCon.getResponseCode();
    if (code != HttpURLConnection.HTTP_OK) {
      throw new IOException("文件读取失败");
    }
    // 读文件流
    DataInputStream in = new DataInputStream(urlCon.getInputStream());
    DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
    byte[] buffer = new byte[2048];
    int count = 0;
    while ((count = in.read(buffer)) > 0) {
      out.write(buffer, 0, count);
    }
    out.close();
    in.close();
    return file;
  }

  /**
   * method2: 下载文件到本地(支持https)
   *
   * @param fileUrl 远程地址
   * @throws Exception
   */
  public static File getNetUrlHttps(String fileUrl, String fileLocal) {
    // 对本地文件进行命名
    File file = null;

    DataInputStream in = null;
    DataOutputStream out = null;
    try {
      file = new File(fileLocal);

      SSLContext sslcontext = SSLContext.getInstance("SSL", "SunJSSE");
      sslcontext.init(
          null, new TrustManager[] {new X509TrustUtiil()}, new java.security.SecureRandom());
      URL url = new URL(fileUrl);
      HostnameVerifier ignoreHostnameVerifier =
          new HostnameVerifier() {
            @Override
            public boolean verify(String s, SSLSession sslsession) {
              System.out.println("WARNING: Hostname is not matched for cert.");
              return true;
            }
          };
      HttpsURLConnection.setDefaultHostnameVerifier(ignoreHostnameVerifier);
      HttpsURLConnection.setDefaultSSLSocketFactory(sslcontext.getSocketFactory());
      HttpsURLConnection urlCon = (HttpsURLConnection) url.openConnection();
      urlCon.setConnectTimeout(6000);
      urlCon.setReadTimeout(6000);
      int code = urlCon.getResponseCode();
      if (code != HttpURLConnection.HTTP_OK) {
        throw new Exception("文件读取失败");
      }
      // 读文件流
      in = new DataInputStream(urlCon.getInputStream());
      out = new DataOutputStream(new FileOutputStream(file));
      byte[] buffer = new byte[2048];
      int count = 0;
      while ((count = in.read(buffer)) > 0) {
        out.write(buffer, 0, count);
      }
      out.close();
      in.close();
    } catch (Exception e) {
      System.out.println("远程图片获取错误：" + fileUrl);
      e.printStackTrace();
    } finally {
      try {
        if (null != out) {
          out.close();
        }
        if (null != in) {
          in.close();
        }
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }

    return file;
  }
}
