
package Inheritance;

public class Test1 {
    public static void main(String[] args) {
        SecondHandVehicle s1=new SecondHandVehicle("123456","SA Group",2015,2000000.00,5);
        s1.display();
        s1.sellVehicle(1000000.00);
        s1.CalcualteAge(50);
    }
}
