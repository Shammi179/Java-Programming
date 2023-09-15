package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>(),array2=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        array.add(124);
        array.add(113);
        array.add(13);
        array.add(14);
        array2.addAll(array);
        for(Integer x:array2)
            System.out.print(x+" ");
        
        System.out.println("\n");
        array.remove(2);
        for(Integer x:array)
            System.out.print(x+" ");
        System.out.println("\n");
        array.set(1,19);
        for(Integer x:array)
            System.out.print(x+" ");
        System.out.println(" "+array.get(0));
        boolean b=array.isEmpty();
        System.out.println(b);
        boolean c=array.contains(19);
        System.out.println(c);
        Collections.sort(array2);
        System.out.println("\n");
        for(Integer x:array2)
            System.out.print(x+" ");
        Collections.sort(array2,Collections.reverseOrder());
        System.out.println("\n");
        for(Integer x:array2)
            System.out.print(x+" ");
       
    }
}
