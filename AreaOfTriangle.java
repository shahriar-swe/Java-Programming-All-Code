
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class AreaOfTriangle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base,height;
        
        System.out.print("Enter Base: ");
        base = input.nextDouble();
        
        System.out.print("Enter Height: ");
        height = input.nextDouble();
        
        double triangle = 0.5 * base * height;
        
        System.out.println("Area Of Triangle = "+triangle);
    }
    
}
