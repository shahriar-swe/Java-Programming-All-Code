
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class CalculatorUseSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int option,number1,number2;
        double sum,sub,mul,rem,dev;
        
        System.out.print("Choose Option (1 sum),(2 sub),(3 mul),(4 dev),(5 rem) :");
        option = input.nextInt();
        
        System.out.print("Enter Number 1 :");
        number1 = input.nextInt();
        
        System.out.print("Enter Number 2 :");
        number2 = input.nextInt();
        
        switch(option){
            case 1:
                sum = number1 + number2;
                System.out.println("Sum = "+sum);
                break;
                
            case 2:
                sub = number1 - number2;
                System.out.println("Sub = "+sub);
                break;
                
            case 3:
                sum = number1 * number2;
                System.out.println("Sum = "+sum);
                break;
                
            case 4:
                sub = number1 / number2;
                System.out.println("Sub = "+sub);
                break;
                
            case 5:
                sub = number1 % number2;
                System.out.println("Sub = "+sub);
                break;
                
            default:
                System.out.println("Option Not Match");
        }
        
    }
    
}
