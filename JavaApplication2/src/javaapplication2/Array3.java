
package javaapplication2;

import java.util.*;

public class Array3 {
    public static void main(String[] args) {
        int[] ar=new int[5];
        int a,l=0;
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ar[i]=s.nextInt();
        }
        a=s.nextInt();
        for (int i = 0; i < 5; i++) {
            if(a==ar[i]){ System.out.println(a+" is found at index "+i);
            l=1;
            break;}
            }
        if(l==0) System.out.println(a+" is not found in this Array");
            
        }
    }
    
