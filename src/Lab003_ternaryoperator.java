public class Lab003_ternaryoperator {
    public static void main(String[] args) {
        String name = "Amruta";
        String result = name == "Amruta" ? "Yes" : "No";
        int age = 34;
        String result1 = age >50 ? "Yes" : "No";
        int x = 56;
        int y = 7;
        int result2= x>y ? x : y;
        int a1= 10, b1=33;
        String result3 = (a1%2==0) ? "a1 is even" : "a1 is odd";
        String result4 = (b1%2==0) ? "b1 is even" : "b1 is odd";

        int a2=-2;
        int b3= 9876543;
        int c=67890;

        int max = (a2>b3) ? (a2>c ? a2 : c) : (b3>c) ? b3 : c;
        String result5= (a2>b3) ? (a2>c ? "a2 is larger" : "c is larger") : (b3>c ? "b3 is larger" : "c is larger");






        System.out.println(result);
        System.out.println(result1);
        System.out.println(Math.max(x,y));
        System.out.println(result2);
        System.out.println(result3);
       // System.out.println(result4);
        System.out.println(result5);
        System.out.println(max);



    }
}
