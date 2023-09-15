
package LabTask;

public class Interface implements A,B{
    public void play(){
        System.out.println("A plays with B");
    }
    public static void main(String[] args) {
        Interface i=new Interface();
        i.play();   
    }
}
