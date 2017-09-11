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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //ask the user for a number
        System.out.println("Please input a number.");
        //record this number
        int number = scanner.nextInt();
        //create a string
        String astericks = new String();
        //keep adding astericks to the string until it equals the nubmer stated by the user
        while (number > 0){
            //add an asterisk to the existing nubmer of asterisks
            astericks = astericks + "*";
            //this asterisk has been counted subtract it from the total required
            number = number - 1;
        }      
        //tell the user
        System.out.println(astericks);
    }
}
