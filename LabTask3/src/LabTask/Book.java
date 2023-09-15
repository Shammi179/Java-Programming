
package LabTask;

import java.util.ArrayList;

public class Book {
    private String name;
    private double price;
    private int qtylnStock;
    private ArrayList<Author> ath=new ArrayList();
    public Book(){}
    public Book(String n,double p,int q){
        this.name=n;this.price=p;this.qtylnStock=q;
    }
    public void updatePrice(double p){
        this.price=p;
    }
    public double getPrice(){
        return price;
    }
    public void Setauthor(Author a){
        ath.add(a);
    }
    
    public void display(){
        System.out.println("Book:");
        System.out.println("Name : "+name);
        System.out.println("Price: "+price);
       System.out.println("Stock: "+qtylnStock);
        System.out.println("\n");
        System.out.println("\nAuthor:");
        for(Author a:ath)
            a.displayInfo();
    }
    
    
}
