
/*
Write a program to check if inputted letter is small or capital
 */
import java.util.Scanner;
        
public class letterSmallCapital {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    

    char ch = myObj.next().charAt(0);
    
    if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch +
                    " is an UpperCase character");
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch +
                    " is an LowerCase character" );
     
        else
            System.out.println("\n" + ch +
                    " is not an aplhabetic character" );
            
    }
            }
