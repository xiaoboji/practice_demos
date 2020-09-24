package d07decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @program: practice-demos
 * @description: 转换大小写
 * @author: xiaoboji
 * @create: 2020-09-24 01:02
 */
public class LowerCaseInputStream extends FilterInputStream {

  public LowerCaseInputStream(InputStream in) {
    super(in);
  }

  @Override
  public int read() throws IOException {
    int c = super.read();
    return (c == -1 ? c : Character.toLowerCase((char) c));
  }

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    int result = super.read(b, off, len);
    for (int i = off; i < off + result; i++) {
      b[i] = (byte) Character.toLowerCase((char) b[i]);
    }
    return result;
  }
}
