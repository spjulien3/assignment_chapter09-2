package program2;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1 ;
        while(x==1) {
            // input a percentage as a decimal for annual interest rate to get a proper calculation
            //The program will print out a chart with a summary including Account Id, Balance, Annual Interest Rate, Monthly Interest, and the date
            //will print Account ID:  5688 Account Balance: $3000.0 Annual Interest Rate: 20.0 Monthly Interest: 50.0 Date Opened: Tue Jan 23 16:42:51 EST 2018
            Account myAccount = new Account(5688, 3000, .20);
            System.out.println(myAccount);

            //will print Account ID:  5492 Account Balance: $79798.56 Annual Interest Rate: 17.5 % Monthly Interest: 1163.729 Date Opened: Tue Jan 23 16:42:51 EST 2018
            Account yourAccount = new Account(5492, 79798.56, .175);
            System.out.println(yourAccount);

            System.out.println("Do you wish to run the program again? (yes(1)/no(0)");
            x= input.nextInt();
        }
    }
}
