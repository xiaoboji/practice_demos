package d05proxy;

/**
 * The type User controller.
 *
 * @program: practice -demos
 * @description: user controller
 * @author: xiaoboji
 * @create: 2020 -08-29 00:49
 */
public class UserController {

  // 依赖注入
  private CountCollector countCollector;

  /**
   * Instantiates a new User controller.
   *
   * @param countCollector the count collector
   */
  public UserController(CountCollector countCollector) {
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
    long responseTime = endTimeStamp - startTimestamp;
    RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
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
    long responseTime = endTimeStamp - startTimestamp;
    RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
    countCollector.recordRequest(requestInfo);
    return true;
  }
}
