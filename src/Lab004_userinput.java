public class Lab004_userinput {
    public static void main(String[] args) {
        String age  = args[0];
        System.out.println(age);
        int age1 = Integer.parseInt(age);

        String result = age1>18 ? (age1>65 ? "SeniorCitizen" : "adult") : "young";
        System.out.println(result);

    }

}
