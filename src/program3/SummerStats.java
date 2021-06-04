package program3;

import java.util.Random;

public class SummerStats {
    private int person = 20;
    private int year = 5;
    private double[][] salaries= new double[20][5];
    private static Random gen = new Random();

    public SummerStats() {
        //Constructor creates the random salaries for each employee
        for (int i = 0; i<person;i++){

            for (int j = 0; j<year;j++){

                salaries[i][j]= gen.nextInt(10000)+5000+gen.nextDouble();
            }
        }
    }
    //Constructor allows user to input a number of people and a number of years if desired
    //Generates the array as well
    public SummerStats(int person, int year) {
        this.person = person;
        this.year = year;
        for (int i = 0; i<person;i++){

            for (int j = 0; j<year;j++){

                salaries[i][j]= gen.nextInt(10000)+5000+gen.nextDouble();
            }
        }

    }

    public void printSalaries() {
        //class that will print all of the salaries and format them.
        System.out.printf("%-9s  %-9s  %-9s  %-9s  %-9s  %-9s \n","Person","Year 1","Year 2","Year 3","Year 4","Year 5");

        for (int k = 0; k<person;k++) {

            System.out.printf("%-6d ||",k);

            for (int j = 0; j < year; j++) {

            System.out.printf("%-9.2f |", salaries[k][j]);

            }

            System.out.println();
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        
    }
    public void highestYear(){
        ///class that gives the year with the highest earned salary
        int max = 0;
        double temp = 0;

        for (int i = 0; i<person;i++){

            for (int j = 0; j<year;j++){

                 if (salaries[i][j]>temp){
                    //gathers the totals and creates a temporary max variable to store the index of the year the highest salary was achieved
                     temp = salaries[i][j];
                     max = j;

                 }
            }
        }
        System.out.println("The highest salary earning year was year "+(1+max)+"\n* * * * * * * * * * * * * * * * * * * * * * * * * * * *");

    }
    public void highestPerson(){
        //class to show the person who made highest sale over the all the years
        int max = 0;
        double temp = 0;
        double total = 0;

        for (int i = 0; i<person;i++){

            for (int j = 0; j<year;j++){

                total += salaries[i][j];

                if (total >temp){

                    temp = total;
                    max = i;

                }
                total=0;
            }
        }
        System.out.println("The highest salary earner person  "+(1+max)+"\n* * * * * * * * * * * * * * * * * * * * * * * * * * * *");

    }
    //prints each persons total salaries
    public void personsTotal(){
        double total = 0;

        System.out.printf("%-20s\n%-10s%-10s\n","Total Sales of Each Person","Person","Total");
        for (int i = 0; i<person;i++){

            for (int j = 0; j<year;j++){

                total += salaries[i][j];
            }
            System.out.printf("%-10d|%-10.2f\n",i,total);
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
    // overloaded method to take in an index to get one person's total salary
    public void personsTotal(int onePerson){
        double total = 0;

        for (int i = 0; i<= onePerson;i++){

            for (int j = 0; j<year;j++){

                total += salaries[i][j];
            }
        }
        System.out.printf("Person: %-10d Total: %-10.2f\n",onePerson,total);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
    //returns and array of the averages of each persons salary and prints them
    public double[] averageSalaries(){
        double[] total = new double[salaries.length];
        double temp = 0;
        for (int i = 0; i<person;i++){

            for (int j = 0; j<year;j++){

                temp += salaries[i][j];
            }
            total[i]= temp/total.length;
            temp=0;
        }
        System.out.printf("Averages of Each Persons Salary\n");
        System.out.printf("%-10s%-10s","Person","Average Salary\n");
        for (int i = 0; i<total.length;i++){
            System.out.printf("%-10d %-10.2f\n",i,total[i]);
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        return total;
    }
    //method creates a sorted array of salaries[][]
    public void sortedSalaries() {
        double[][] sort = new double[person][year];
        double[][] tempSort2 = new double[person][year];
        double temp2 = 0;
        double temp1 =0;
        //uses this boolean to determine when to swap a lower number for a higher number in the next index
        boolean swap = true;
        //gives the sorted array all of salaries[][] contents
         for (int i = 0; i < person; i++) {

                for (int j = 0; j < year; j++) {

                    sort[i][j] = salaries[i][j];

                }

            }
            while(swap) {
                swap = false;
                for (int k = 0; k < person-1; k++) {
                    temp1=0;
                    temp2=0;
                    for (int j = 0; j < year; j++) {
                        temp1 += sort[k][j];
                        temp2 += sort[k+1][j];
                    }
                    //checks if a swap is needed and continues if not
                    if(temp2>temp1){
                        for (int j = 0;j < year;j++) {
                            //uses another array to hold on to a value to swap
                            tempSort2[0][0] = sort[k][j];
                            sort[k][j] = sort [k+1][j];
                            sort[k+1][j]= tempSort2[0][0];
                            swap = true;
                        }
                    }



                }


            }


        // Prints the new sorted chart


        System.out.printf("%-20s\n%-10s%-10s\n", "Total Sales of Each Person", "Person", "Total");

        System.out.printf("%-9s  %-9s  %-9s  %-9s  %-9s  %-9s \n", "Person", "Year 1", "Year 2", "Year 3", "Year 4", "Year 5");

        for (int k = 0; k < person; k++) {

            System.out.printf("%-6d ||", k);

            for (int j = 0; j < year; j++) {

                System.out.printf("%-9.2f |", sort[k][j]);

            }
            System.out.println();
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
}
