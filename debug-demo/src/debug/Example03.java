package debug;

public class Example03 {

    private static int exclude0(String str){
        str = str.toLowerCase();
        //将不是o的值全部都替换成空
        return str.replaceAll("[^o]" ,"").length();
    }

    public static void main(String[] args) {
        String name = "Hello W0uld";
        int count = exclude0(name);
        System.out.println(count);
    }
}
