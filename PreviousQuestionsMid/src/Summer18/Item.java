
package Summer18;

public class Item {
    private String itemName;
    private double price;
    public Item(){}
    public Item(String itemName,double price){
        this.itemName=itemName;this.price=price;
    }
    public void display(){
        System.out.println("\n\nItemName:"+itemName+"\nPrice:"+price);
    }
}
