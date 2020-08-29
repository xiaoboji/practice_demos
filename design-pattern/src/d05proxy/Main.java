package d05proxy;

import d05proxy.interfaceImpl.IUserController;
import d05proxy.interfaceImpl.UserController;
import d05proxy.interfaceImpl.UserControllerProxy;

/**
 * @program: practice-demos
 * @description:
 * @author: xiaoboji
 * @create: 2020-08-30 00:23
 */
public class Main {
  public static void main(String[] args) throws InterruptedException {
    IUserController userController = new UserControllerProxy(new UserController());
    userController.login("xiaoboji", "123");
  }
}
