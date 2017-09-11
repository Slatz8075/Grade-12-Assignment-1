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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a doubel which will add all 6 expenses 
        double Costs = 0;
        //create an array for the names of these expenses
        String[] Expenses ={"food","DJ","hall rental","decorations","wait staff","miscellaneous expenses"};
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //create counter for the number of expenses
        int count = 0;
        //create a whicle loop asking recording and adding the inputted expenses 
        while (count < 6) {
            //ask for the expenses 
            System.out.println("How much will the " + Expenses[count] + " cost?");
            //add the expense
            Costs = Costs + scanner.nextDouble();
            //add 1 to the counter, so that next time user will be asked for something else
            count++;
        }
        //tell the user what all the costs together with be
        System.out.println("The total cost of prom is " + Costs );
    }
}