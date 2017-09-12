/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import java.util.Scanner;

/**
 *
 * @author slatz8075
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //ask the user for the inital amount invested
        System.out.println("What is the inital amount invested and the interest rate it is invested at?");
        //store the investment number (the initial investment will be used for doubling itself - soon this amount will be duplicated for the million dollar amount)
        double doublingInvestment = scanner.nextDouble();
        //create a control amount for keeping track of the goal in mind (doubling)
        double controldoublingInvestment = doublingInvestment;
        //store the interest rate number
        double interestRate = scanner.nextDouble();
        //duplicate the investment vairable so that is may be used to calculate the money doubling and how long it take to reach 1 million dollars
        double millionInvestment = doublingInvestment;
        //create a year count for the doubling investment
        int doublingYear = 0;
        //create a year count for the million dollar goal investment
        int millionYear = 0;
        //create a while loop for calculating how long it is until the money doubles
        while (doublingInvestment <= controldoublingInvestment * 2) {
            //calculate the new balance
            doublingInvestment = (1 + interestRate) * doublingInvestment;
            //increase the year count
            doublingYear = doublingYear + 1;
        }
        //test to see if we have reach our goal of doubling our investment
        if (doublingInvestment >= controldoublingInvestment * 2) {
            //tell the user how many years it will take
            System.out.println("it will take " + doublingYear + " year(s) to double the initial investment");
        }
        //create a while loop for calculating how long it is until the money reaches 1 million dollars
        while (millionInvestment <= 1000000) {
            //calculate the new balance
            millionInvestment = (1 + interestRate) * millionInvestment;
            //increase the year count
            millionYear = millionYear + 1;
        }
        //test to see if we have reach our goal of reaching 1 million dollars
        if (millionInvestment >= 1000000) {
            //tell the user how many years it will take
            System.out.println("it will take " + millionYear + " year(s) to reach 1 million dollars");
        }
    }
}
