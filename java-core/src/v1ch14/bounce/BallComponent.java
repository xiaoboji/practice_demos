package v1ch14.bounce;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * @program: practice-demos
 * @description: The component that draws the balls.
 * @author: xiaoboji
 * @create: 2020-07-27 23:32
 */
public class BallComponent extends JPanel {
  private static final int DEFAULT_WIDTH = 450;
  private static final int DEFAULT_HEIGHT = 350;

  private java.util.List<Ball> balls = new ArrayList<>();

  public void add(Ball b) {
    balls.add(b);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    for (Ball b : balls) {
      g2.fill(b.getShape());
    }
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
  }
}
