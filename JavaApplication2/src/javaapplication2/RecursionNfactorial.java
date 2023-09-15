
package javaapplication2;

import java.util.Scanner;

public class RecursionNfactorial {
   public static int recursion(int n)
   {
       if(n==1)
           return 1;
       else
       {
           return (n*recursion(n-1));
       }
   }
    public static void main(String[] args) {
        int res,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        res=recursion(n);
        System.out.println("Factorial of "+n+" is "+res);
    }
    
}
