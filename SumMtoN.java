
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class SumMtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n ,sum=0;
        System.out.print("Enter Start Number:");
        m = input.nextInt();
        
        System.out.print("Enter End Number:");
        n = input.nextInt();
        
        System.out.println("Sum m to n");
        for (int i = m ; m <= n; m++) {
            sum = sum+m;
        }
        System.out.println("Sum = "+sum);
    }
    
}
//3