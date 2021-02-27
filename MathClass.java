
package basicjava;

/**
 *
 * @author shahr
 */
public class MathClass {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        
        System.out.println("Maximum number is :"+Math.max(x, y));
        
        System.out.println("Minimum number is :"+Math.min(x, y));
        
        System.out.println("Absolute number of y :"+Math.abs(y));
        
        System.out.println("x to the power y :"+Math.pow(x, y));
        
        int round;
        System.out.println("round of 8.8 :"+Math.round(8.8f));
        
        System.out.println("PI :"+Math.PI);
    }
    
}
