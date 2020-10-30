import java.io.*;
import java.util.Scanner;
public class factorial{

     public static void main(String []args){
         int n,i,fact=1,j;
        System.out.println("enter the value of n:");
        Scanner v=new Scanner(System.in);
        n=v.nextInt();
        if(n==0)
        {
            System.out.println(fact=1);
        }
    
            for(i=1;i<=n;i++)
            {
               for(j=1;j<=i;j++)
               {
                   fact=fact*j;
               }
              System.out.println("factorial of " + i + "=" + fact);
            }
    
        
     }
      
}

output

enter the value of n:                                                                                                                         
6                                                                                                                                             
factorial of 1=1                                                                                                                              
factorial of 2=2                                                                                                                              
factorial of 3=12                                                                                                                             
factorial of 4=288                                                                                                                            
factorial of 5=34560                                                                                                                          
factorial of 6=24883200 

        
 