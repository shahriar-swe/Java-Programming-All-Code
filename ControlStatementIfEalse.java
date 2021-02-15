
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class ControlStatementIfEalse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Enter Any Number :");
        number = input.nextInt();
        
        if(number>0){
            System.out.println("Positive");
        }else if(number == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}
