package d05proxy.interfaceImpl;

/**
 * The interface User controller.
 *
 * @program: practice -demos
 * @description: 接口, 定义了登录和注册功能
 * @author: xiaoboji
 * @create: 2020 -08-30 00:11
 */
public interface IUserController {
  /**
   * Login boolean.
   *
   * @param telephone the telephone
   * @param password the password
   * @return the boolean
   */
  boolean login(String telephone, String password) throws InterruptedException;

  /**
   * Register boolean.
   *
   * @param telephone the telephone
   * @param password the password
   * @return the boolean
   */
  boolean register(String telephone, String password) throws InterruptedException;
}
