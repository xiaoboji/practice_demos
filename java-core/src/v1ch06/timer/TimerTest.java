package v1ch06.timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * @program: practice-demos
 * @description: Timer
 * @author: xiaoboji
 * @create: 2020-07-07 23:57
 */
public class TimerTest {

  public static void main(String[] args) {

    ActionListener listener = new TimePrinter();

    Timer t = new Timer(10000, listener);
    t.start();
    JOptionPane.showConfirmDialog(null, "Quit program?");
    System.exit(0);
  }
}

class TimePrinter implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("At the tone, the time is " + new Date());
    Toolkit.getDefaultToolkit().beep();
  }
}
