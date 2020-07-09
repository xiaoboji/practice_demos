package v1ch06.lambda;

import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * @program: practice-demos
 * @description: this program demonstrates the use of lambda expressions.
 * @author: xiaoboji
 * @create: 2020-07-09 22:12
 */
public class LambdaTest {
  public static void main(String[] args) {
    String[] planets =
        new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Urans", "Nepture"};
    System.out.println(Arrays.toString(planets));
    System.out.println("Sorded in dictionary order:");
    Arrays.sort(planets);
    System.out.println(Arrays.toString(planets));
    System.out.println("Sorded by length:");
    Arrays.sort(planets, (first, second) -> first.length() - second.length());
    System.out.println(Arrays.toString(planets));

    Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
    t.start();

    // keep program running until user selects OK
    JOptionPane.showMessageDialog(null, "Quit program?");
    System.exit(0);
  }
}
