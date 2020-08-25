package v1ch14.unsynch;

/**
 * The type Unsynch bank test.
 *
 * @program: practice -demos
 * @description: this program shows data corruption when multiple threads access a data structure
 * @author: xiaoboji
 * @create: 2020 -08-01 23:27
 */
public class UnsynchBankTest {

  /** The constant NACCOUTS. */
  public static final int NACCOUTS = 100;

  /** The constant INITIAL_BALANCE. */
  public static final double INITIAL_BALANCE = 1000;

  /** The constant MAX_AMOUNT. */
  public static final double MAX_AMOUNT = 1000;

  /** The constant DELAY. */
  public static final int DELAY = 10;

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Bank bank = new Bank(NACCOUTS, INITIAL_BALANCE);
    for (int i = 0; i < NACCOUTS; i++) {
      int fromAccount = i;
      Runnable r =
          () -> {
            try {
              while (true) {
                int toAccount = (int) (bank.size() * Math.random());
                double amount = MAX_AMOUNT * Math.random();
                bank.transfer(fromAccount, toAccount, amount);
                Thread.sleep((int) (DELAY * Math.random()));
              }
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          };
      Thread t = new Thread(r);
      t.start();
    }
  }
}
