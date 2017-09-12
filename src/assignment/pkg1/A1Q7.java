/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author slatz8075
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create year nubmer
        int year = 1999;
        //create population - though this is only 60 million, it is enough to demonstrate the correct number
        double population = 60000000.00;
        //create a while loop that will multiply up to 100 million (like 60 million it is enough to demonstrate 10 billion)
        while(population <100000000.00){
            //multiply the number
            population = population * 1.014;
            //increase the year correspondingly
            year = year + 1;
            //if the number has reached above 10 billion tell the user
            if(population >= 100000000.00){
                //print the population in correct format
                System.out.printf("The population is %.0f\n", population);
                //also tell the year 
                System.out.println("in the year " + year);
            }
            
            
        }
    }
}
