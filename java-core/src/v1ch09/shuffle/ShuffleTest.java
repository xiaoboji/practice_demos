package v1ch09.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: practice-demos
 * @description: this program demonstrates the random shuffle and sort algorithms
 * @author: xiaoboji
 * @create: 2020-07-23 00:36
 */
public class ShuffleTest {
  public static void main(String[] args) {
    //

    List<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= 49; i++) {
      numbers.add(i);
    }
    Collections.shuffle(numbers);
    List<Integer> winningCombination = numbers.subList(0, 6);
    Collections.sort(winningCombination);
    System.out.println(winningCombination);
  }
}
