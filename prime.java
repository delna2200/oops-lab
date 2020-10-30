//program to determine a number is prime
import java.io.*;
public class prime{

     public static void main(String []args){
         int m=11;
         int i,flag=0;
         for(i=2;i<m/2;i++)
         {
             if(m%i==0)
             {
                 flag=1;
                 break;
             }
         }
         if(flag==1)
           System.out.println(m+ " is not prime");
         else
          System.out.println(m+" is prime");
     }
}