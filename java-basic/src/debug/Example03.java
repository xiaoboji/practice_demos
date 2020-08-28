package debug;

public class Example03 {

    private static int exclude0(String str){
        str = str.toLowerCase();
        //将不是o的值全部都替换成空
        return str.replaceAll("[^o]" ,"").length();
    }

    static class User{
        String  username;
        String  password;

        public User(String username,String password){
            this.password = password;
            this.username = username;
        }
    }

    public static void main(String[] args) {
        User user = new User("xiaoming","123456");
        if(user.username.isEmpty()){
            System.out.println("username is impty");
        }
        String name = "Hello W0uld";
        int count = exclude0(name);
        System.out.println(count);
    }
}
