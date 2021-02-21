
package basicjava;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class CheckSmallAndCapitalLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch;
        System.out.print("Enter Any Charecter :");
        ch = input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            System.out.println(ch+" :is a Small Letter");
        }else if(ch>='A' && ch<='Z'){
            System.out.println(ch+" :is a Capital Letter");
        }else{
            System.out.println(ch+" :Not a Letter");
        }
    }
    
}
//21