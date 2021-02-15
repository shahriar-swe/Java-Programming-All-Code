
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch;
        System.out.print("Enter Any Charecter :");
        ch = input.next().charAt(0);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch+" is Vowel");
        }else{
            System.out.println(ch+" is Consonant");
        }
        
    }
    
}
