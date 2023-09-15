
package javaapplication2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int t,p,r;
       Scanner s=new Scanner(System.in);
        System.out.print("Test Case:");
        t=s.nextInt();
        for (int i = 0; i < t; i++) {
            r=0;
            p=s.nextInt();
            for (int j = 2; j < p; j++) {
                if(p%j==0) r++;
            }
            if(r>0) System.out.println(p+" is not prime number");
            else System.out.println(p+" is prime number");
            
        }
    }
    
}
