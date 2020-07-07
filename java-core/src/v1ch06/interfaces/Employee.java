package v1ch06.interfaces;

/**
 * @program: practice-demos
 * @description: Empolyee
 * @author: xiaoboji
 * @create: 2020-07-07 23:03
 */
public class Employee implements Comparable<Employee> {

  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  /** Compares employees by salary */
  @Override
  public int compareTo(Employee other) {
    return Double.compare(salary, other.salary);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
  }
}
