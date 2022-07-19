
/*
  Write a program to calculate GPA and find grade
 */


import java.util.Scanner;

public class gpa {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    
    double total_point = myObj.nextDouble();
    int total_subject = myObj.nextInt();
    
    double avg = total_point/total_subject;
if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }    }
    
}
