package ArrayAndArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
       Integer[]arr=new Integer[13];
       int l;
       l=arr.length;
        System.out.println(l);
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 13; i++) {
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < 13; i++) {
            System.out.print(arr[i]+" ");
        }
         System.out.println("\n");
       Arrays.sort(arr,Collections.reverseOrder());
         for (int i = 0; i < 13; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
