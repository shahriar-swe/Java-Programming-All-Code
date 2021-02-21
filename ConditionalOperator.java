
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1,number2;
        System.out.print("Enter Number 1 :");
        number1 = input.nextInt();
        
        System.out.print("Enter Number 2 :");
        number2 = input.nextInt();
        
        int large = (number1>number2) ? number1: number2;
        
        System.out.println("large number is = "+large);
    }
    
}
