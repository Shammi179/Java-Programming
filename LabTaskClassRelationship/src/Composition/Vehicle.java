
package Composition;

public abstract class Vehicle {
    protected String color,seat;
    protected Vehicle(){}
    protected Vehicle(String color,String seat){
        this.color=color;this.seat=seat;
    }
    public abstract void display();
        
}
