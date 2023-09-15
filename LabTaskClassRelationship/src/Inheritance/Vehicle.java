
package Inheritance;

public class Vehicle {
    private String regNo,make;
    private int yearOfManufacture;
    private double value;
    String getRegNumber;
    public Vehicle(String r,String m,int y,double v)
    {
        this.regNo=r;this.make=m;
        this.yearOfManufacture=y;this.value=v;  
    }
    public String getRegNumber(){
        return regNo;
    }
    public String getMake(){
        return make;
    }
    public int getYear(){
        return yearOfManufacture;
    }
    public double getValue(){
        return value;
    }
    public void setValue(double v){
        this.value=v;
    }
    public int CalcualteAge(int a){
        int ag;
        ag=a;
        System.out.println("Age:"+ag);
        return ag;
        
    }
    
   
}
