package d05proxy.dynamic;

import d05proxy.CountCollector;
import d05proxy.RequestInfo;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: practice-demos
 * @description:
 * @author: xiaoboji
 * @create: 2020-08-30 00:47
 */
public class CountCollectorProxy {

  private CountCollector countCollector;

  public CountCollectorProxy() {
    this.countCollector = new CountCollector();
  }

  public Object createProxy(Object proxiedObject) {
    Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
    DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
    return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
  }

  private class DynamicProxyHandler implements InvocationHandler {
    private Object proxiedObject;

    public DynamicProxyHandler(Object proxiedObject) {
      this.proxiedObject = proxiedObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      long startTimestamp = System.currentTimeMillis();
      Object result = method.invoke(proxiedObject, args);
      long endTimeStamp = System.currentTimeMillis();
      String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
      RequestInfo requestInfo = new RequestInfo(apiName, endTimeStamp, startTimestamp);
      countCollector.recordRequest(requestInfo);
      return result;
    }
  }
}
