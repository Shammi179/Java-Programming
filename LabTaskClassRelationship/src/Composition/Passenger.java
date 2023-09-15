
package Composition;

public class Passenger {
    private String name;
    private int age;
    public Passenger(){}
    public Passenger(String name,int age){
        this.name=name;this.age=age;
    }
    public void display(){
        System.out.println("Name:"+name+"\nAge:"+age);
    }
}
