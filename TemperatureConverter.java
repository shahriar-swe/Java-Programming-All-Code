
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class TemperatureConverter {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double celsious,farenheit;
        
        System.out.print("Celsious = ");
        celsious = input.nextDouble();
        
        //System.out.print("Farenheit = ");
        //farenheit = input.nextDouble();
        
        //celsious to Farenheit
        //F = 9/5* c+ 32;
        //Farenheit to celsious C = 5/9 ( F - 32)
        farenheit = 1.8 * celsious + 32;
        System.out.println("Farenheit = "+farenheit);
       
    }
    
}
