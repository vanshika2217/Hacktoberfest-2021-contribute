
import java.util.*;
import java.io.*;

public class fibonacci {
  static void fib(int n)
    {
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
    for(int k=0;k<n;k++){
      System.out.print(f[k]+" ");
    }
    System.out.println();

      
    
    }
  public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t>0){
      int n=Integer.parseInt(br.readLine());
      fib(n);
      
      
      
      
      t--;
    }
    
  }
}