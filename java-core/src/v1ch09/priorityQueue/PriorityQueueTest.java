package v1ch09.priorityQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @program: practice-demos
 * @description: This program demonstrates the use of a priority queue.
 * @author: xiaoboji
 * @create: 2020-07-22 23:32
 */
public class PriorityQueueTest {

  public static void main(String[] args) {
    PriorityQueue<LocalDate> priorityQueue = new PriorityQueue<>();
    priorityQueue.add(LocalDate.of(1906, 12, 9));
    priorityQueue.add(LocalDate.of(1815, 12, 10));
    priorityQueue.add(LocalDate.of(1903, 12, 3));
    priorityQueue.add(LocalDate.of(1910, 6, 22));

    System.out.println("Iterating over elements...");
    for (LocalDate date : priorityQueue) {
      System.out.println(date);
    }
    System.out.println("Removing elements...");
    while (!priorityQueue.isEmpty()) {
      System.out.println(priorityQueue.remove());
    }
  }
}
