
package javaapplication5;

import java.util.Random;

public class JavaApplication5 {

    public static void main(String[] args) {
        Random r=new Random();
int n=r.nextInt(10);
        System.out.println(n);
        for (int i = 0; i <n; i++) {
            System.out.println("OOP");
        }
        char[] ar=new char[]{'a','b','c'};
       // ar[]={'a','b','c'};
        for (int i = (ar.length)-1; i >=0; i--) {
            System.out.println(ar[i]);
            
        }
        Integer b=98;
        //b=21;
        System.out.println(b);
    }
    
}
