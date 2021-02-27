
package basicjava;

/**
 *
 * @author shahriar
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        
        do{
            System.out.println(i+". Bangladesh");
            i++;
        }while(i<=5);
        
        
        System.out.println("Print Even Number 1 to 10");
        int x = 2;
        do{
            System.out.println(x);
            x = x+2;
        }while(x<=10);
        
        
        System.out.println("Print Odd Number 1 to 10");
        int y = 1;
        do{
            System.out.println(y);
            y = y+2;
        }while(y<=10);
        
        
        System.out.println("Decreement 5 to 1");
        int z = 5;
        do{
            System.out.println(z);
            z--;
        }while(z>=1);
    }
    
}
