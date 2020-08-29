package d05proxy.extendsImpl;

import d05proxy.CountCollector;
import d05proxy.RequestInfo;

/**
 * @program: practice-demos
 * @description: UserController
 * @author: xiaoboji
 * @create: 2020-08-30 00:41
 */
public class UserControllerProxy extends UserController {
  private CountCollector countCollector;

  public UserControllerProxy() {
    this.countCollector = new CountCollector();
  }

  @Override
  public boolean register(String telephone, String password) throws InterruptedException {
    long startTimestamp = System.currentTimeMillis();
    boolean result = super.register(telephone, password);
    long endTimeStamp = System.currentTimeMillis();
    RequestInfo requestInfo = new RequestInfo("register", endTimeStamp, startTimestamp);
    countCollector.recordRequest(requestInfo);
    return result;
  }

  @Override
  public boolean login(String telephone, String password) throws InterruptedException {
    long startTimestamp = System.currentTimeMillis();
    boolean result = super.register(telephone, password);
    long endTimeStamp = System.currentTimeMillis();
    RequestInfo requestInfo = new RequestInfo("login", endTimeStamp, startTimestamp);
    countCollector.recordRequest(requestInfo);
    return result;
  }
}
