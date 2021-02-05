
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        String name;
        int age;
        
        System.out.print("Please Enter Your Name:");
        name = input.nextLine();
        System.out.print("Please Enter Your Age:");
        age = input.nextInt();
        
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    
}
