
package Spring19;
public class Item {
    private String itemname;
    private double price;
    public Item(){}
    public Item(String itemname,double price){
        this.itemname=itemname;this.price=price;
    }
    public void display(){
        System.out.println("Item name:"+itemname+"\nItem Price:"+price);
    }
    
}
