package d09composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: practice-demos
 * @description: 部门类
 * @author: xiaoboji
 * @create: 2020-10-02 22:36
 */
public class Department extends HumanResource {

  private List<HumanResource> subModes = new ArrayList<>();

  public Department(long id) {
    super(id);
  }

  @Override
  public double calculateSalary() {
    double totalSalary = 0;
    for (HumanResource humanResource : subModes) {
      totalSalary += humanResource.calculateSalary();
    }
    this.salary = totalSalary;
    return totalSalary;
  }

  public void addSubNode(HumanResource hr) {
    subModes.add(hr);
  }

  public List<Long> getSubDepartmentIds(long id) {
    List result = new ArrayList();
    for (HumanResource humanResource : subModes) {
      if (humanResource instanceof Department) {
        result.add(humanResource.getId());
      }
    }
    return result;
  }

  public List<Long> getSubEmployeeIds(long id) {
    List result = new ArrayList();
    for (HumanResource humanResource : subModes) {
      if (humanResource instanceof Employee) {
        result.add(humanResource.getId());
      }
    }
    return result;
  }
}
