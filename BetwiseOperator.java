
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class BetwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = 32,b = 12, c;
        
        c = a & b;
        System.out.println("a & b : "+c);
        
        c = a | b;
        System.out.println("a | b : "+c);
        
        c = a ^ b;
        System.out.println("a ^ b : "+c);
        
        c = a >> 3;
        System.out.println("a >> b : "+c);
        
        c = a << 3;
        System.out.println("a << b : "+c);
    }
    
}
