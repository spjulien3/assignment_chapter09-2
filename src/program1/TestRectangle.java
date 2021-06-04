package program1;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        while(x==1) {
            //will print out the width, height, area(160.0), and Perimeter(88.0)
            Rectangle r1 = new Rectangle(4, 40);
            System.out.println(r1);

            //will print out the width, height, area(125.65), and Perimeter(78.8)
            Rectangle r2 = new Rectangle(3.5, 35.9);
            System.out.println(r2);

            //Default rectangle
            //will print out the width, height, area(1.0), and Perimeter(4.0)
            Rectangle r3 = new Rectangle();
            System.out.println(r3);

            System.out.println("Do you wish to run the program again? (yes(1)/no(0)");
            x= input.nextInt();
        }
    }
}
