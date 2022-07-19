
/*
  Write  a program to find the factorial of a given number
 */

import java.util.Scanner;


public class Factorial {
        
    static int fact(int n){
    
    if (n == 0)    
    return 1;    
    else    
    return(n * fact(n-1));    
    
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myObj = new Scanner(System.in);  
        int num = myObj.nextInt();
        int result = fact(num);
        System.out.println(result);
        
    }
    
}
