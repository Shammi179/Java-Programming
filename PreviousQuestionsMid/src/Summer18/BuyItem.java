package Summer18;
public class BuyItem {
   private String buyDate;
   private int quantity;
   public BuyItem(){}
   public BuyItem(String buyItem,int quantity){
       this.buyDate=buyDate;this.quantity=quantity;
   }
   public void display(){
       System.out.println("\n\nBuy Date:"+buyDate+"\nQuantity:"+quantity);
   }
    public static void main(String[] args) {
        Customer c1=new Customer("123","123");
        Item i1=new Item("NUN",20);
        Item i2=new Item("Gril",80);
        c1.buy(i1);
        c1.buy(i2);
        BuyItem b1=new BuyItem("12-10-12",2);
        c1.display();
        b1.display();
    }
}
