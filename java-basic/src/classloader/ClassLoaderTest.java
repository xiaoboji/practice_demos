package classloader;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: practice-demos
 * @description: 类加载器与instanceof关键词展示
 * @author: xiaoboji
 * @create: 2021-01-18 22:14
 */
public class ClassLoaderTest {
  public static void main(String[] args) throws Exception {
    ClassLoader myClassLoader =
        new ClassLoader() {
          @Override
          public Class<?> loadClass(String name) throws ClassNotFoundException {
            String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
            InputStream is = getClass().getResourceAsStream(fileName);
            if (is == null) {
              return super.loadClass(name);
            }
            byte[] b;
            try {
              b = new byte[is.available()];
              is.read(b);
              return defineClass(name, b, 0, b.length);
            } catch (IOException e) {
              throw new ClassNotFoundException(name);
            }
          }
        };
    Object obj = myClassLoader.loadClass("classloader.ClassLoaderTest").newInstance();
    System.out.println(obj.getClass());
    System.out.println(obj instanceof classloader.ClassLoaderTest);
  }
}
