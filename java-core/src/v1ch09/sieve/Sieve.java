package v1ch09.sieve;

import java.util.BitSet;

/**
 * @program: practice-demos
 * @description: this program runs the sieve of Erathostenes benchmark ,it computes all primes up to
 *     2000000
 * @author: xiaoboji
 * @create: 2020-07-23 00:41
 */
public class Sieve {
  // main
  public static void main(String[] args) {
    int n = 2000000;
    long start = System.currentTimeMillis();
    BitSet b = new BitSet(n + 1);
    int count = 0;
    int i;
    for (i = 2; i <= n; i++) {
      b.set(i);
    }
    i = 2;
    while (i * i <= n) {
      if (b.get(i)) {
        count++;
        int k = 2 * i;
        while (k <= n) {
          b.clear(k);
          k += i;
        }
      }
      i++;
    }
    while (i <= n) {
      if (b.get(i)) {
        count++;
      }
      i++;
    }
    long end = System.currentTimeMillis();
    System.out.println(count + " primes");
    System.out.println((end - start) + " milliseconds");
  }
}
