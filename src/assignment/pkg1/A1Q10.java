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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        // tell the user to input as many words as they like
        System.out.println("please input words to your hearts desire");
        //create a counter to count how many times the while loop has triggered
        int wordCount = 0;
        //create a string for the word to occupy
        String word = new String();
        //allow words to counted until the word exit has been entered 
        while (word.equals("exit") == false) {
            //add one to the number of times the while loop has triggered
            wordCount++;
            //overwrite the previous word we don't care about since it is not "exit"
            word = scanner.nextLine();;
        }
        //we have gotten out of the above while loop therefore we can tell the user how many words they have entered
        System.out.println("You have entered " + wordCount + " words");
    }
}

