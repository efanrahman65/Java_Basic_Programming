



/* Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.
 */

import java.util.Scanner;

public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
 
        int number;
        int max = 0;  
        int min = 0;  
 
        char choice;
 
        do
        {
            System.out.print("Enter the number ");
            number = obj.nextInt();
 
            if(number > max)
            {
                max = number;
            }
 
            if(number < min)
            {
                min = number;
            }
 
            System.out.print("Do you want to continue y/n? ");
            choice = obj.next().charAt(0);
 
        }while(choice=='y' || choice == 'Y');
 
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }  
    }
    
