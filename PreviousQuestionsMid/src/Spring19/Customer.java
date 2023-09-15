package Spring19;

import java.util.ArrayList;

public class Customer extends User {
    private String name,email;
    ArrayList<Item> item=new ArrayList();
    public Customer(){
        
    }
    public Customer(String userid,String passwd,String name,String email){
        super(userid,passwd);this.name=name;this.email=email;
    }
    public void buy(Item i){
       item.add(i); 
    }
    public void display(){
        super.display();
        System.out.println("Customer's Information:\n"+"Name:"+name+"\nEmail:"+email);
        System.out.println("Items Information:\n");
        for(Item a:item){
            a.display();}
    }
    public static void main(String[] args) {
        Customer c1=new Customer("12345","khgwe","Shammi","shumaiya@gmail.com");
        Item i1=new Item("Mango",550.60);
        Item i2=new Item("Bottle",280.00);
        c1.buy(i1);c1.buy(i2);
        c1.display();
    }
}
