package v1ch07.logging;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The type Logging image viewer.
 *
 * @program: practice -demos
 * @description: A modification of the image viewer program that logs various events
 * @author: xiaoboji
 * @create: 2020 -07-12 23:53
 */
public class LoggingImageViewer {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    if (System.getProperty("java.util.logging.config.class") == null
        && System.getProperty("java.util.logging.config.file") == null) {
      try {
        Logger.getLogger("v1ch07.logging").setLevel(Level.ALL);
        final int LOG_ROTATION_COUNT = 10;
        Handler handler = new FileHandler("%h/LoggingImageViewer.log", 0, LOG_ROTATION_COUNT);
        Logger.getLogger("v1ch07.logging").addHandler(handler);
      } catch (IOException e) {
        Logger.getLogger("v1ch07.logging").log(Level.SEVERE, "Can't create log file handler", e);
      }
    }

    EventQueue.invokeLater(
        () -> {
          Handler windowHandler = new windowHandler();
          windowHandler.setLevel(Level.ALL);
          Logger.getLogger("v1ch07.logging").addHandler(windowHandler);

          JFrame frame = new ImageViewerFrame();
          frame.setTitle("LoggingImageViewer");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          Logger.getLogger("v1ch07.logging").fine("Showing frame");
          frame.setVisible(true);
        });
  }
}

/** The type Image viewer fram. */
class ImageViewerFrame extends JFrame {
  private static final int DEFAULT_WIDTH = 300;
  private static final int DEFAULT_HEIGHT = 400;
  private JLabel label;
  private static Logger logger = Logger.getLogger("com.horstrmann.corejava");

  public ImageViewerFrame() {
    logger.entering("ImageViewerFrame", "<init>");
    setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

    // Set up menu bar
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu menu = new JMenu("File");
    menuBar.add(menu);

    JMenuItem openItem = new JMenuItem("open");
    menu.add(openItem);
    openItem.addActionListener(new FileOpenListener());

    JMenuItem exitItem = new JMenuItem("exit");
    menu.add(exitItem);
    exitItem.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            logger.fine("Exiting.");
            System.exit(0);
          }
        });
    label = new JLabel();
    add(label);
    logger.exiting("ImageViewerFrame", "<init>");
  }

  private class FileOpenListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
      logger.entering("ImageViewFrame.FileOpenListener", "actionPerformed", event);
      // set up file chooser
      JFileChooser chooser = new JFileChooser();
      chooser.setCurrentDirectory(new File("."));

      // accept all files ending with .gif
      chooser.setFileFilter(
          new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
              return f.getName().toLowerCase().endsWith(".gif") || f.isDirectory();
            }

            @Override
            public String getDescription() {
              return "GIF Images";
            }
          });

      // show file chooser dialog
      int r = chooser.showOpenDialog(ImageViewerFrame.this);

      // if image file accepted. set it as icon of the label
      if (r == JFileChooser.APPROVE_OPTION) {
        String name = chooser.getSelectedFile().getPath();
        logger.log(Level.FINE, "Reading file {0}", name);
        label.setIcon(new ImageIcon(name));
      } else {
        logger.fine("File open dialog canceled.");
      }
      logger.exiting("ImageViewrFrame.FileOpenListener ", "actionPerformed");
    }
  }
}

class windowHandler extends StreamHandler {
  private JFrame frame;

  public windowHandler() {
    frame = new JFrame();
    final JTextArea output = new JTextArea();
    output.setEditable(false);
    frame.setSize(200, 200);
    frame.add(new JScrollPane(output));
    frame.setFocusableWindowState(false);
    frame.setVisible(true);
    setOutputStream(
        new OutputStream() {
          @Override
          public void write(int b) throws IOException {}

          public void write(byte[] b, int off, int len) {
            output.append(new String(b, off, len));
          }
        });
  }

  @Override
  public void publish(LogRecord record) {
    if (!frame.isVisible()) {
      return;
    }
    super.publish(record);
    flush();
  }
}
