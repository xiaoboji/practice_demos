package v1ch06.innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * The type Inner class test.
 *
 * @program: practice -demos
 * @description: this program demonstartes the use of inner classses
 * @author: xiaoboji
 * @create: 2020 -07-11 22:21
 */
public class InnerClassTest {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    TalkingClock clock = new TalkingClock(1000, true);
    clock.start();
    // keep progaram running until user selects "OK"
    JOptionPane.showMessageDialog(null, "Quit program?");
    System.exit(0);
  }
}
/** The type Talking clock. */
class TalkingClock {
  private int interval;
  private boolean beep;

  /**
   * Instantiates a new Talking clock.
   *
   * @param interval the interval
   * @param beep the beep
   */
  public TalkingClock(int interval, boolean beep) {
    this.interval = interval;
    this.beep = beep;
  }

  /** Start. */
  public void start() {
    ActionListener listener = new TimePrinter();
    Timer t = new Timer(interval, listener);
    t.start();
  }

  /** The type Time printer. */
  public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
      System.out.println("At the tone, the time is " + new Date());
      if (beep) {
        Toolkit.getDefaultToolkit().beep();
      }
    }
  }
}
