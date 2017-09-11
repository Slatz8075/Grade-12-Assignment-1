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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an array with 3 spaces for 3 numbers
        double[] nums = new double[3];
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //ask for these 3 numbers
        System.out.println("Please input three numbers");
        //store 1st number
        nums[0] =  scanner.nextDouble();
        //store 2nd number
        nums[1] =  scanner.nextDouble();
        //store 3rd number
        nums[2] =  scanner.nextDouble();
        //create a double for the product of these three numbers
        double product = nums[0] * nums[0] * nums[0];
        //tell the use this product
        System.out.println("The product of these numbers are: " + product);
        //calculate the square of this product
        double productPower = Math.pow(product,2);
        //tell the user the square of the product
        System.out.println(product + " to the power of 2 is " + productPower);
        //calculate the squareroot of the product
        double rootProduct = Math.sqrt(product);
        //tell the user the squareroot of the product
        System.out.println("The squareroot of " + product + " is " + rootProduct);
        
    }
}
