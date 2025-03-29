package Array;

public class Arrays_Basic {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(a.length);
        System.out.println(a[0]);
        boolean [] b = {true,false,true};
        System.out.println(b[1]);
        String [] s1 = {"Amisha", "renuka", "Riya"};
        System.out.println(s1[2]);

        //Second way to define array
        int [] a1 = new int[5];
        a1[0] = 7;
        a1[3] = 9;
        System.out.println(a1[3]);
        String [] s2 = new String[3];
        s2[0]= "Amula";
        s2[1]= "teja";
        s2[2]="Rameela";
        System.out.println(s2[1]);






    }
}
