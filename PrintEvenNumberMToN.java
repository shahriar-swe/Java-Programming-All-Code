
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class PrintEvenNumberMToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m,n ,sum=0;
        System.out.print("Enter Start Number:");
        m = input.nextInt();
        
        System.out.print("Enter End Number:");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            //odd number print korte chaile just ei condition likhlei hobe baki shob thik if(i%2 != 0)
            if(i%2 == 0){
                sum = sum+i;
                System.out.println(i);
            }
        }
        System.out.println("sum of even number from m to n = "+sum);
    }
    
}
