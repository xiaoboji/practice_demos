package d09composite;

import java.util.List;

/**
 * @program: practice-demos
 * @description: oa demo，
 *     <p>一个 OA 系统（办公自动化系统）。公司的组织结构包含部门和员工两种数据类型。其中，部门又可以包含子部门和员工。
 *     <p>在内存中构建整个公司的人员架构图（部门、子部门、员工的隶属关系），并且提供接口计算出部门的薪资成本（隶属于这个部门的所有员工的薪资和）
 * @author: xiaoboji
 * @create: 2020-10-02 22:28
 */
public class OADemo {
  private static final long ORGANIZATIon_ROOT_ID = 1001;
  private Department departmentRepo;
  private Employee employeeRepo;

  private void buildOrganization() {
    Department rootDepartment = new Department(ORGANIZATIon_ROOT_ID);
    buildOrganization(rootDepartment);
  }

  private void buildOrganization(Department department) {
    List<Long> subDepartmentIds = departmentRepo.getSubDepartmentIds(department.getId());
    for (Long id : subDepartmentIds) {
      Department subDepartment = new Department(id);
      department.addSubNode(subDepartment);
      buildOrganization(subDepartment);
    }

    List<Long> subEmployeeIds = departmentRepo.getSubEmployeeIds(department.getId());
    for (Long id : subEmployeeIds) {
      double salary = employeeRepo.getEmployeeSalary(id);
      department.addSubNode(new Employee(id, salary));
    }
  }
}
