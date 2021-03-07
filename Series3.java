
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class Series3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum = 0;
        
        System.out.print("Please Enter Last number : ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i+"x"+i+" ");
            sum = sum + i * i;
            
        }
        System.out.println("Sum = "+sum);
    }
    
}
//6