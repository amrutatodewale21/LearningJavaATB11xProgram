public class Lab005_user_input_even_odd {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        if (num%2 == 0)
        {
           System.out.printf("%d is even number",num);

        }
        else
        {
            System.out.printf("%d is odd number",num);
        }
    }

}
