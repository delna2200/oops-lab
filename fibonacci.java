//program to print fibonacci series
import java.io.*;
public class fibonacci{

     public static void main(String []args){
       int n=9,i,t1=0,t2=1,t3;
       System.out.println(t1 + " "  + t2);
       for(i=1;i<n;i++)
       {
          t3=t1+t2;
          t1=t2;
          t2=t3;
          System.out.println( t3);
       }
       
       
     }
}
output
0 1                                                                                                                                           
1                                                                                                                                             
2                                                                                                                                             
3                                                                                                                                             
5                                                                                                                                             
8                                                                                                                                             
13                                                                                                                                            
21
34