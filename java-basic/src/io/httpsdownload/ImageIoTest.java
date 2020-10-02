package io.httpsdownload;

import java.io.File;
import java.io.IOException;

/**
 * 获取https图片
 *
 * @author xiaobiji
 */
public class ImageIoTest {
  public static void main(String[] args) throws IOException {
    // method1
    File file1 =
        HttpsUtils.getNetUrlHttps(
            "https://static001.geekbang.org/resource/image/f6/d5/f6afb18cec369e4ef08e5231668813d5.jpg",
            "F:\\temp\\image_method1.jpg");
    System.out.println(file1.getPath());
  }
}
