
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Enter Any Positive Number :");
        number = input.nextInt();
        
        if(number %2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    
}
