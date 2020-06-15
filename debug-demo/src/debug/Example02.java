package debug;

public class Example02 {

    private static void execute(int num){
        System.out.println("execute: " + num);
    }

    public static void main(String[] args) {
        for (int i=0;i<1000;i++) {
            execute(i);
        }

    }
}
