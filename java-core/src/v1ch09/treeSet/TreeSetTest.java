package v1ch09.treeSet;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @program: practice-demos
 * @description: this program sorts a set of item by comparing their descriptions.
 * @author: xiaoboji
 * @create: 2020-07-22 23:16
 */
public class TreeSetTest {
  public static void main(String[] args) {
    //
    SortedSet<Item> parts = new TreeSet<>();
    parts.add(new Item("Toaster", 1234));
    parts.add(new Item("Widget", 4562));
    parts.add(new Item("Modem", 9912));

    System.out.println(parts);

    NavigableSet<Item> sortByDescription =
        new TreeSet<>(Comparator.comparing(Item::getDescription));
    sortByDescription.addAll(parts);
    System.out.println(sortByDescription);
  }
}
