package v1ch09.treeSet;

import java.util.Objects;

/**
 * The type Item.
 *
 * @program: practice -demos
 * @description: An item with a description and a part number
 * @author: xiaoboji
 * @create: 2020 -07-22 23:17
 */
public class Item implements Comparable<Item> {
  private String description;
  private int partNumber;

  /**
   * Instantiates a new Item.
   *
   * @param description the description
   * @param partNumber the part number
   */
  public Item(String description, int partNumber) {
    this.description = description;
    this.partNumber = partNumber;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Item other = (Item) obj;
    return Objects.equals(description, other.description) && partNumber == other.partNumber;
  }

  @Override
  public String toString() {
    return "[description = " + description + " ,partNumber=" + partNumber + "]";
  }

  @Override
  public int compareTo(Item o) {
    int diff = Integer.compare(partNumber, o.partNumber);
    return diff != 0 ? diff : description.compareTo(o.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, partNumber);
  }
}
