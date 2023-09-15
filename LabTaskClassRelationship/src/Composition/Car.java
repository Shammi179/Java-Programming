
package Composition;

import java.util.ArrayList;

public class Car extends Vehicle {
    private String make,model;
    ArrayList<Passenger> passenger=new ArrayList();
    Engine engine;
    public Car(){}
    public Car(String color,String seat,String make,String model){
        super(color,seat);
        this.make=make;this.model=model;
        engine=new Engine();
    }
    public void setPassenger(Passenger p){
        passenger.add(p);
    }
    public void setEngine(Engine e){
        this.engine=e;
    }
    public void display(){
        System.out.println("Car's Info\nColor:"+super.color+"\nSeat:"+super.seat);
        System.out.println("Make:"+make+"\nModel:"+model);
        engine.display();
        for(Passenger pp:passenger){
            pp.display();
        }
    }
    public static void main(String[] args) {
        Car c1=new Car("Red","30 seats","SS","lhsr");
        Engine e1=new Engine(1300);
        Passenger p1=new Passenger("SS",34);
       Passenger p2=new Passenger("SSsd",37);
       c1.setEngine(e1);
       c1.setPassenger(p1);
       c1.setPassenger(p2);
       c1.display();
    }
    
}
