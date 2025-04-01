package Array;

public class Print_2d_Array {
    public static void main(String[] args) {
        int [][] Array = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i =0;i<Array.length;i++)
        {
            for(int j=0;j<Array.length;j++)
            {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
