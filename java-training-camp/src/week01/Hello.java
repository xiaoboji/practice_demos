package week01;

/**
 * @program: practice-demos
 * @description: 自己写一个简单的 Hello.java，里面需要涉及基本类型，四则运行，if 和 for，然后 自己分析一下对应的字节码，有问题群里讨论。
 * @author: xiaoboji
 * @create: 2020-10-19 23:44
 */
public class Hello {

  public static void main(String[] args) {
    int i = 1;
    int j = 10;
    // 四则运算-加减乘除
    int add = i + j;
    int subtract = i - j;
    int multiply = i * j;
    int divide = i / j;

    if (add == subtract) {
      System.out.println("");
    }

    for (int index = 0; index < 10; index++) {
      i++;
      j--;
      ++multiply;
      --divide;
    }
  }
}
