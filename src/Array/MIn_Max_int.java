package Array;

public class MIn_Max_int {
    public static void main(String[] args) {
       int[] a = {56,78,34,89,66};

       int result1 = give_me_max(a);
        System.out.println(result1);
        int result2 = give_me_min(a);
        System.out.println(result2);
    }

    private static int give_me_max(int[] a) {
        int max=a[0];// 56,78,98,90,96
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        return max;

    }
    private static int give_me_min(int[] a)
    {
        int min=a[0];
        for(int j=0;j<a.length;j++)
        {
            if(min>a[j])
            {
                min=a[j];

            }
        }
        return min;


    }

}
