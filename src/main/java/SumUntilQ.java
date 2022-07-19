

/*Write a program to sum of user input until users input ‘q’ from keyboard
 */

import java.util.Scanner;

public class SumUntilQ {

    
    public static void main(String[] args) {
        int sum=0;
        Scanner myObj = new Scanner(System.in);  
        
        while(true){
        System.out.println("Enter the numbers to get the total sum:");
        sum += myObj.nextInt();
        
        System.out.println("Enter q to quit or Enter any other character to continue:");
        int ch = myObj.next().charAt(0);
        if(ch=='q'){
            break;
        }
        
       
    
}
    System.out.println("Total sum:"+sum);
}
}