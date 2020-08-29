package d05proxy;

/**
 * The type User controller.
 *
 * @program: practice -demos
 * @description: user controller
 * @author: xiaoboji
 * @create: 2020 -08-29 00:49
 */
public class NormalUserController {
  /** 依赖注入 */
  private CountCollector countCollector;

  public NormalUserController(CountCollector countCollector) {
    this.countCollector = countCollector;
  }

  /**
   * Login boolean.
   *
   * @param telephone the telephone
   * @param password the password
   * @return the boolean
   */
  public boolean login(String telephone, String password) {
    long startTimestamp = System.currentTimeMillis();

    System.out.println("处理逻辑执行···");
    long endTimeStamp = System.currentTimeMillis();
    RequestInfo requestInfo = new RequestInfo("login", endTimeStamp, startTimestamp);
    countCollector.recordRequest(requestInfo);

    return true;
  }

  /**
   * Register boolean.
   *
   * @param telephone the telephone
   * @param password the password
   * @return the boolean
   */
  public boolean register(String telephone, String password) {
    long startTimestamp = System.currentTimeMillis();
    System.out.println("处理逻辑执行···");
    long endTimeStamp = System.currentTimeMillis();
    RequestInfo requestInfo = new RequestInfo("register", endTimeStamp, startTimestamp);
    countCollector.recordRequest(requestInfo);
    return true;
  }
}
