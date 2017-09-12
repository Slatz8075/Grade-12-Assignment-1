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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //create an array for the words
        String[] words = new String[10];
        //ask the user for the inital amount invested
        System.out.println("Insert 10 words");
        //create double to store the total amount of letters inputted
        double average = 0;
        //store these words through the use of a for loop
        for(int count = 0; count < 10; count++){
            //store words
            words[count] = scanner.nextLine();
            //add the number of letters inputted to the average
            average = average + words[count].length();
        }
        //since 10 words were input, dividing by ten should give the average length of all the words
        average = average/10;
        //tell the user
        System.out.println(average);
    }
}