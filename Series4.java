
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class Series4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,multiply = 1;
        
        System.out.print("Please Enter Last number : ");
        n = input.nextInt();
        //n = 5 result 1 3 5  = 15
        //1 2 3  4 5 eirokom chaile condition for (int i = 1; i <= n; i = i++)
        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i+" ");
            multiply =  multiply * i;
            
        }
        System.out.println("");
        System.out.println("Multiply = "+multiply);
    }
    
}
//7