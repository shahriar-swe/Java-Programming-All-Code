
package basicjava;

/**
 *
 * @author shahr
 */
public class ForLoop {
    public static void main(String[] args) {
        
        for(int i = 1;i <= 10;i++){
            System.out.println(i+". Bangladesh");
        }
        
        System.out.println("Even Number 1 to 10");
        for(int i = 2;i <= 10;i=i+2){
            System.out.println(i);
        }
        
        System.out.println("Odd Number 1 to 10");
        for(int i = 1;i <= 10;i=i+2){
            System.out.println(i);
        }
        
        
        System.out.println("Decreement 5 to 1");
        for(int i = 5;i >= 1;i--){
            System.out.println(i);
        }
    }
}
