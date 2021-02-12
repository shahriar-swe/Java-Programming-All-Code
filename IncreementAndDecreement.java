
package basicjava;

/**
 *
 * @author shahr
 */
public class IncreementAndDecreement {
    public static void main(String[] args) {
        
        int x = 25;
        int result;
        
        //result = x++;//post increement
        //System.out.println("result = "+result);
        
        result = --x;//pre increement
        System.out.println("result = "+result);
        
        result = x--;
        System.out.println("result = "+result);
        
        result = ++x;//pre increement
        System.out.println("result = "+result);
        
        result = x++;//post increement
        System.out.println("result = "+result);
    }
    
}
