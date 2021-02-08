//program to check a number is palindrome
import java.io.*;
import java.util.Scanner;
public class palindrome{

     public static void main(String []args){
         int n,reverse=0,original,remainder;
        System.out.println("enter the value of n:");
        Scanner v=new Scanner(System.in);
        n=v.nextInt();
        original=n;
       while(n!=0)
       {
           remainder=n%10;
           reverse=reverse*10+remainder;
           n=n/10;
       }
       if(reverse==original)
       {
           System.out.println(original +"is palindrome");
           
       }
       else
      {
           System.out.println(original+"is not palindrome");
           
       }
     }
output
enter the value of n:                                                                                                                         
45654                                                                                                                                         
45654is palindrome  