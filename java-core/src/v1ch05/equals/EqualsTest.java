package v1ch05.equals;

/**
 * @program: practice-demos
 * @description: This program demonstrates the equals method
 * @author: xiaoboji
 * @create: 2020-06-25 22:35
 */
public class EqualsTest {
  public static void main(String[] args) {
    Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
    Employee alice2 = alice1;
    Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
    Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);
    System.out.println("alice1 == alice2:" + (alice1 == alice2));
    System.out.println("alice1 == alice3:" + (alice1 == alice3));
    System.out.println("alice1.equals(alice3):" + alice1.equals(alice3));
    System.out.println("alice1.equals(bob):" + alice1.equals(bob));
    System.out.println("bob.toString():" + bob);

    Manager car1 = new Manager("Carl Cracker", 80000, 1987, 12, 15);
    Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);

    boss.setBonus(50000);
    System.out.println("boss.toString(): " + boss);
    System.out.println("carl.equals(boss): " + car1.equals(boss));
    System.out.println("alicel.hashCode()： " + alice1.hashCode());
    System.out.println("alice3.hashCode(): " + alice3.hashCode());
    System.out.println("bob.hashCode(): " + bob.hashCode());
    System.out.println("carl.hashCode(): " + car1.hashCode());
  }
}
