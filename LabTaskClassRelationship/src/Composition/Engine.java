
package Composition;

public class Engine {
    private double power;
    public Engine(){}
    public Engine(double power){
        this.power=power;
    }
    public void display(){
        System.out.println("Power:"+power);
    }
    
}
