package d05proxy.extendsImpl;

/**
 * @program: practice-demos
 * @description: 具体实现类
 * @author: xiaoboji
 * @create: 2020-08-30 00:14
 */
public class UserController {

  public boolean login(String telephone, String password) throws InterruptedException {
    System.out.println("处理逻辑执行···");
    Thread.sleep(100);
    return true;
  }

  public boolean register(String telephone, String password) throws InterruptedException {
    System.out.println("处理逻辑执行···");
    Thread.sleep(100);
    return true;
  }
}
