package reflect.frame;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @program: practice-demos
 * @description: this is a simple fram demo
 * @author: xiaoboji
 * @create: 2020-08-23 23:32
 */
public class FrameTest {
  public static void main(String[] args) throws Exception {
    // 第1步：加载配置文件和数据
    // 1.1 java万物皆对象，Properties也有对应的对象，创建Properties对象
    Properties properties = new Properties();
    // 1.2 获取本类的classLoader，用以可以找到frame.properties
    ClassLoader classLoader = FrameTest.class.getClassLoader();
    // 1.3 读取frame.properties文件
    InputStream in = classLoader.getResourceAsStream("frame.properties");
    // 1.4 加载进Properties对象之中
    properties.load(in);
    // 1.5 获取配置文件中的定义的数据
    String className = properties.getProperty("className");
    String methodName = properties.getProperty("methodName");

    // 第2步：加载该类进内存
    Class cls = Class.forName(className);

    // 第3步：创建对象
    Object obj = cls.newInstance();

    // 第4步：获取方法对象
    Method method = cls.getMethod(methodName);

    // 第5步：执行方法
    method.invoke(obj);
  }
}
