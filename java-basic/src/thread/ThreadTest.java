package thread;

/**
 * @program: practice-demos
 * @description: Thread test
 * @author: xiaoboji
 * @create: 2021-02-16 00:51
 */
public class ThreadTest {
  public static void main(String[] args) {
    Runnable task =
        new Runnable() {
          @Override
          public void run() {
            try {
              Thread.sleep(2000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            Thread t = Thread.currentThread();
            System.out.println("当前线程：" + t.getName());
          }
        };
    Thread thread = new Thread(task);
    thread.setName("bobook-thread-1");
    thread.setDaemon(true);
    thread.start();
  }
}
