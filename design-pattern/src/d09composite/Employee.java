package d09composite;

/**
 * @program: practice-demos
 * @description: 员工类
 * @author: xiaoboji
 * @create: 2020-10-02 22:34
 */
public class Employee extends HumanResource {

  public Employee(long id, double salary) {
    super(id);
    this.salary = salary;
  }

  @Override
  public double calculateSalary() {
    return salary;
  }

  public double getEmployeeSalary(Long id) {
    return salary;
  }
}
