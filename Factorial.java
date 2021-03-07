
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,fact = 1;
        
        System.out.print("Please Enter Last number : ");
        n = input.nextInt();
        
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
            System.out.print(i+" ");
            
        }
        System.out.println("");
        System.out.println("Factorial of "+n+" ="+fact);
    }
    
}
//8