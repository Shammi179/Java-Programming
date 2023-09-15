package Summer18;

import java.util.ArrayList;

public class Customer {
    private String userID,passwd;
    ArrayList<Item> item=new ArrayList();
    public Customer(){}
    public Customer(String userID,String passwd){
        this.userID=userID;this.passwd=passwd;
    }
    public void buy(Item i){
        item.add(i);
    }
    public void display(){
        System.out.println("\n\nUserID:"+userID);
        for(Item it:item)
            it.display();
    }
    
    
}
