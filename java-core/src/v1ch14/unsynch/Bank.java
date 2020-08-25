package v1ch14.unsynch;

import java.util.Arrays;

/**
 * The type Bank.
 *
 * @program: practice -demos
 * @description: A bank with a number of bank accounts.
 * @author: xiaoboji
 * @create: 2020 -08-01 23:30
 */
public class Bank {
  private final double[] accounts;

  /**
   * Instantiates a new Bank.
   *
   * @param n the n
   * @param initialBalance the initial balance
   */
  public Bank(int n, double initialBalance) {

    this.accounts = new double[n];
    Arrays.fill(accounts, initialBalance);
  }

  /**
   * Transfer.
   *
   * @param from the from
   * @param to the to
   * @param amount the amount
   */
  public void transfer(int from, int to, double amount) {

    if (accounts[from] < amount) {
      return;
    }

    System.out.print(Thread.currentThread());
    accounts[from] -= amount;
    System.out.printf(" %10.2f from %d to %d ", amount, from, to);
    accounts[to] += amount;
    System.out.printf("Total Balance : %10.2f%n", getTotalBalance());
  }

  /**
   * Get total balance double.
   *
   * @return the double
   */
  public double getTotalBalance() {

    double sum = 0;
    for (double a : accounts) {
      sum += a;
    }
    return sum;
  }

  /**
   * Size int.
   *
   * @return the int
   */
  public int size() {
    return accounts.length;
  }
}
