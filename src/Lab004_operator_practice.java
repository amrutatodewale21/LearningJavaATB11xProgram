public class Lab004_operator_practice {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
    }
}
//expression A = --a -> 19, a=19
//expression B = a++ -> 19, a=20
//expression C = a-- -> 20, a 19