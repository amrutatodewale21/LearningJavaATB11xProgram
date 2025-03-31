package Array;

public class Even_odd_Array {
    public static void main(String[] args) {
        int [] Array = {34,67,89,33,56,78,99};
        for(int i=0;i<Array.length;i++)
        {
            if (Array[i]%2 ==0)
            {
                System.out.println("Even: " + Array[i]);
            }
            else
            {
                System.out.println("odd: " + Array[i]);
            }
        }



    }
}
