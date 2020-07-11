package v1ch06.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * The type Proxy test.
 *
 * @program: practice -demos
 * @description: this program demonstrates the use of proxies
 * @author: xiaoboji
 * @create: 2020 -07-11 23:03
 */
public class ProxyTest {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Object[] elements = new Object[1000];
    for (int i = 0; i < elements.length; i++) {
      Integer value = i + 1;
      InvocationHandler handler = new TraceHandler(value);
      Object proxy = Proxy.newProxyInstance(null, new Class[] {Comparable.class}, handler);
      elements[i] = proxy;
    }

    // construct a random integer
    Integer key = new Random().nextInt(elements.length) + 1;

    // search for the key
    int result = Arrays.binarySearch(elements, key);

    // print match if found
    if (result >= 0) {
      System.out.println(elements[result]);
    }
  }
}

/**
 * An invocation handler that prints out the method name and parameters ,the invokes the original
 * method
 */
class TraceHandler implements InvocationHandler {
  private Object target;

  /**
   * Instantiates a new Trace handler.
   *
   * @param t the t
   */
  public TraceHandler(Object t) {
    target = t;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.print(target);
    System.out.print("." + method.getName() + "(");

    if (args != null) {
      for (int i = 0; i < args.length; i++) {
        System.out.print(args[i]);
        if (i < args.length - 1) {
          System.out.print(", ");
        }
      }
      System.out.println(")");

      return method.invoke(target, args);
    }

    return null;
  }
}
