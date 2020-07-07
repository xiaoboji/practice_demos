package v1ch06.interfaces;

import java.util.Arrays;

/**
 * @program: practice-demos
 * @description: This program demonstrates the use of the Comparable interface
 * @author: xiaoboji
 * @create: 2020-07-07 23:01
 */
public class EmpolyeeSortTest {
  public static void main(String[] args) {
    //
    Employee[] staff = new Employee[3];
    staff[0] = new Employee("Harry Hacker", 35000);
    staff[1] = new Employee("Carl Cracker", 75000);
    staff[2] = new Employee("Tony Tester", 38000);

    Arrays.sort(staff);

    for (Employee e : staff) {
      System.out.println("name = " + e.getName() + ",salary = " + e.getSalary());
    }
  }
}
