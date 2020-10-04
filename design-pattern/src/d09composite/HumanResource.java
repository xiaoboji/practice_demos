package d09composite;

/**
 * @program: practice-demos
 * @description: 部门类和员工类抽象出来的父类，为的是统一处理薪资的处理逻辑
 * @author: xiaoboji
 * @create: 2020-10-02 22:30
 */
public abstract class HumanResource {
  protected long id;
  protected double salary;

  public HumanResource(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  /**
   * 计算薪水
   *
   * @return 处理结果
   */
  public abstract double calculateSalary();
}
