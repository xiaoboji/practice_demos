package v1ch06.anonymousInnerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * @program: practice-demos
 * @description: This program demonstrates anonymous Inner classes
 * @author: xiaoboji
 * @create: 2020-07-11 22:44
 */
public class AnonymousInnerClassTest {
  public static void main(String[] args) {
    TalkingClock clock = new TalkingClock();
    clock.start(1000, true);

    JOptionPane.showMessageDialog(null, "Quit program?");
    System.exit(0);
  }
}

class TalkingClock {
  public void start(int interval, boolean beep) {
    ActionListener listener =
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is " + new Date());
            if (beep) {
              Toolkit.getDefaultToolkit().beep();
            }
          }
        };
    Timer t = new Timer(interval, listener);
    t.start();
  }
}
