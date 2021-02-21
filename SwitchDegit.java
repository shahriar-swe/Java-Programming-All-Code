
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class SwitchDegit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int degit;
        System.out.print("Enter A Number :");
        degit = input.nextInt();
        
        switch(degit){
            case 0:
                System.out.println("Zero");
                break;
            
            case 1:
                System.out.println("One");
                break;
                
           case 2:
               System.out.println("Two");
               break;
               
           case 3:
               System.out.println("Three");
               break;
               
           case 4:
               System.out.println("Four");
               break;
               
           default:
               System.out.println("Degit not match");
        }
    }
    
}
//23