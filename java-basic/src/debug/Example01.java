package debug;

/**
 *基本使用
 *
 * @author JH
 */
public class Example01 {

    public static boolean hello = false;
    static class CustomException extends RuntimeException{
        public CustomException(String message) {
            super(message);
        }
    }

    private static void helloInetllij(){
        System.out.println("Hello");
        System.out.println("How are you!");
        throw new CustomException("I'm sorry!");
    }

    public static void main(String[] args) {
        helloInetllij();
        System.out.println("Good Bye");
    }
}
