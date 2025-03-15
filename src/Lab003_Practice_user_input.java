public class Lab003_Practice_user_input {
    public static void main(String[] args) {
        int a1=Integer.parseInt(args[0]);
        int a2=Integer.parseInt(args[1]);
        int sum = (a1>a2) ? a1 : a2;
        System.out.println(sum);

    }


}
