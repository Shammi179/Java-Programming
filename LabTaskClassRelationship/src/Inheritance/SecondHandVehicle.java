package Inheritance;
public class SecondHandVehicle extends Vehicle {
    private int numberOfOwners;
    public SecondHandVehicle(String r,String m,int y,double v,int n){
        super(r,m,y,v);
        this.numberOfOwners=n;
    }
    public int getNumberOfOwners(){
        return numberOfOwners;
    }
    public void sellVehicle(double sv){
        setValue(sv);
        System.out.println("SellVehicle:"+sv);
    }
    public void display(){
        System.out.println("RegNo:"+super.getRegNumber());
        System.out.println("Make:"+super.getMake());
        System.out.println("Year:"+super.getYear());
        System.out.println("Value:"+super.getValue());
        System.out.println("Number of owners:"+numberOfOwners);
        
    }
}
