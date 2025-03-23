package Loops;

public class Lab004_Even_odd {
    public static void main(String[] args) {
        for(int i =0;i<=50;i++)
        {
            if(i%2 == 0)
            {
                System.out.println("Even-> " + i);
            }
            else
            {
                System.out.println("odd-> " + i);
            }
        }
    }
}
