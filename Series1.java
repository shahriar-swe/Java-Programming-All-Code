
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahriar
 */
public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum = 0;
        
        System.out.print("Please Enter Last number : ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
            sum = sum + i;
            
        }
        System.out.println("Sum = "+sum);
    }
    
}
