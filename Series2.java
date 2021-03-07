
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum = 0;
        
        System.out.print("Please Enter Last number : ");
        n = input.nextInt();
        //1 3 5 7 9 korte chaile condition : int i = 1; i <= n; i = i+2 
        //1.5 2.5 3.5 korte chaile condition : double i = 1.5; i <= n; i = i+1 
        for (int i = 2; i <= n; i = i+2) {
            System.out.print(i+" ");
            sum = sum + i;
            
        }
        System.out.println("Sum = "+sum);
    }
    
}
