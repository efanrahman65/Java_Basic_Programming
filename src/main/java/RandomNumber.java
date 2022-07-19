/*
Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.
 */

import java.util.Scanner;

public class RandomNumber {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int point = 0;
        for(int i=0;i<10;i++){
        int min=1;
        int max=10;
        int a = (int)(Math.random()*(max-min+1)+min);  
        int b = (int)(Math.random()*(max-min+1)+min);
        Scanner myObj = new Scanner(System.in);  
        int num = myObj.nextInt();
        if(num==b || num==a){
            point+=1;
        
        }
              
    }
        System.out.println("Total point is:"+point);
    }
 
}
