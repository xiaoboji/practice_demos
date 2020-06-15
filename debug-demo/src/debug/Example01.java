package debug;

/**
 *基本使用
 *
 * @author JH
 */
public class Example01 {

    static class CustomException extends RuntimeException{
        public CustomException(String message) {
            super(message);
        }
    }

    private static void helloInetllij(){
        System.out.println("我是一只小小小鸟");
        System.out.println("想要飞却怎么样也飞不高!");
        throw new CustomException("I'm sorry!");
    }

    public static void main(String[] args) {
        helloInetllij();
        System.out.println("No 怕不了木");
    }
}
