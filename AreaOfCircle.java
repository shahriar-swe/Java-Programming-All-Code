
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class AreaOfCircle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radious;
        
        System.out.print("Enter Base: ");
        radious = input.nextDouble();
        
        
        double circle = 3.1416 * radious * radious;
        
        System.out.println("Area Of Circle = "+circle);
    }
    
}
