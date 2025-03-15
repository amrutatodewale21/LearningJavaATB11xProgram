public class Lab005_task {
    public static void main(String[] args) {

        String score = args[0];
        int score1= Integer.parseInt(score);
        System.out.println(score1);
        String a = (score1>=90 && score1<=100) ? "A" :
                (score1>=80 && score1<=89) ? "B" :
                        (score1>=70 && score1<=79) ? "c" :
                                (score1>=60 && score1<=69) ? "D" :
                                        (score1>=0 && score1<=59) ? "F" : "invalidscore";
        System.out.println(a);





    }


}
