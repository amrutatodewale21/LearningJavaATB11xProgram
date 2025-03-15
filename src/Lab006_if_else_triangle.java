public class Lab006_if_else_triangle {
    public static void main(String[] args) {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        if(side1 ==side2 && side2==side3 && side1==side3) // 3 3 3
        {
            System.out.println("Triangle is equilateral");
        }
        else if (side1 ==side2 || side2==side3 || side1==side3) // 5 9 5
        {
            System.out.println("Triangle is isosceles");
        }
        else
        {
            System.out.println("Triangle is scalene");
        }


    }

}
