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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //ask the user for a number between 100 and 50 which they wish the count to stop at
        System.out.println("Enter a number between 50 and 100 to stop at");
        //store this number
        double number = scanner.nextDouble();
        //create the countdown number
        int countDown = 100;
        //begin the count down
        while (countDown > number){
            //display the current count down number
            System.out.println(countDown);
            //count down the count down
            countDown = countDown - 5;
        }
    }
}
