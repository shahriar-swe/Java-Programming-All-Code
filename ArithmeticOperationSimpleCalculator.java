
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class ArithmeticOperationSimpleCalculator {
    
    public static void main(String[] args) {
        int number1,number2;
        double add,sub,dev,multiply,remainder;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number1: ");
        number1 = input.nextInt();
        System.out.print("Please Enter Number2: ");
        number2 = input.nextInt();
        
        add = number1 + number2;
        sub = number1 - number2;
        dev = (double)number1 / number2;
        multiply = number1 * number2;
        remainder = number1 % number2;
        
        System.out.println("Add = "+add);
        System.out.println("Sub = "+sub);
        System.out.println("Dev = "+dev);
        System.out.println("Multiply = "+multiply);
        System.out.println("Reminder = "+remainder);
    }
    
}
