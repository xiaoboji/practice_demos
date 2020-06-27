package v1ch05.enums;

import java.util.Scanner;

/**
 * @program: practice-demos
 * @description: This program demonstrates enumerated types.
 * @author: xiaoboji
 * @create: 2020-06-27 00:06
 */
public class EnumTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter s size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
    String input = in.next().toUpperCase();
    Size size = Enum.valueOf(Size.class, input);
    System.out.println("Size = " + size);
    System.out.println("abbreviation = " + size.getAbbreviation());
    System.out.println(Size.SMALL.toString());
    if (size == Size.EXTRA_LARGE) {
      System.out.println("Good job -- you paid attention to the _.");
    }
  }
}

enum Size {
  // small
  SMALL("S"),
  MEDIUM("M"),
  LARGE("L"),
  EXTRA_LARGE("XL");

  Size(String abbreiation) {
    this.abbreviation = abbreiation;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  private String abbreviation;
}
