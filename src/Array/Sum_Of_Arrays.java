package Array;

public class Sum_Of_Arrays {
    public static void main(String[] args) {
        int [] Array = {45,78,12,88,6};
        int result=give_me_sum(Array);
        System.out.println("Sum of array elements is " + result);

    }

    public static int give_me_sum(int[] Array) {
        int sum=0;
        for(int i=0;i<Array.length;i++)
        {
            sum=sum+Array[i];
        }
        return sum;
    }


}
