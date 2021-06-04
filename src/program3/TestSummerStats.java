package program3;

import java.util.Scanner;

public class TestSummerStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=1;
        while(x==1) {
            //Class that will give you default values of 20 people and 5 years when using default constructor
            //Class will allow numbers to be passed through to get desired chart
            SummerStats s1 = new SummerStats(300, 5);
            //Method will print out a table with all salaries for each person for each year
            s1.printSalaries();
            //Method will take search the generated information to retrieve the year with the highest salary and print the result
            s1.highestYear();
            //Method will find the person with the who has made the most money and print the result
            s1.highestPerson();
            //Method will print a chart of the totals of each person's salaries of all years combined
            s1.personsTotal();
            //Method is overloaded to take a person's number to give their specific total from all year combined
            s1.personsTotal(3);
            //Method will return an array of the averages of each person and will print a chart displaying all averages
            s1.averageSalaries();
            //Method will sort the list by highest totals and will print them in a chart
            s1.sortedSalaries();


            System.out.println("Do you wish to run the program again? (yes(1)/no(0)");
            x= input.nextInt();
        }
    }
}
