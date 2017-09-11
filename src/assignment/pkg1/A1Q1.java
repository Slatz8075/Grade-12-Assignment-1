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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        // Ask user for his [OR HER'S!] name
        System.out.println("What is your name?");
        //store name
        String name = scanner.nextLine();
        //say hello
        System.out.println("Hello " + name + "!");
    }
}
