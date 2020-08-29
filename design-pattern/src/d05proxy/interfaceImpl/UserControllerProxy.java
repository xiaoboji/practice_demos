package d05proxy.interfaceImpl;

import d05proxy.CountCollector;
import d05proxy.RequestInfo;

/**
 * @program: practice-demos
 * @description:
 * @author: xiaoboji
 * @create: 2020-08-30 00:15
 */
public class UserControllerProxy implements IUserController {
  private UserController userController;
  private CountCollector countCollector;

  public UserControllerProxy(UserController userController) {
    this.userController = userController;
    this.countCollector = new CountCollector();
  }

  @Override
  public boolean register(String telephone, String password) throws InterruptedException {
    long startTimestamp = System.currentTimeMillis();
    boolean result = userController.register(telephone, password);
    long endTimeStamp = System.currentTimeMillis();
    RequestInfo requestInfo = new RequestInfo("register", endTimeStamp, startTimestamp);
    countCollector.recordRequest(requestInfo);
    return result;
  }

  @Override
  public boolean login(String telephone, String password) throws InterruptedException {
    long startTimestamp = System.currentTimeMillis();
    boolean result = userController.register(telephone, password);
    long endTimeStamp = System.currentTimeMillis();
    RequestInfo requestInfo = new RequestInfo("login", endTimeStamp, startTimestamp);
    countCollector.recordRequest(requestInfo);

    return result;
  }
}
