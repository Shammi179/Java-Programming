
package LabTask;

import java.util.ArrayList;

public class Student {
    private String  name;
    private double id;
    private int age;
     private ArrayList<Book> bk=new ArrayList();
    public Student(){}
    public Student(String n,double i,int a){
        this.name=n;
        this.id=i;
        this.age=a;
    }
    public void buy(Book b){
        bk.add(b);
    }
    public void displayInfo(){
        System.out.println("Student:");
        System.out.println("Name : "+name);
        System.out.println("ID   : "+id);
        System.out.println("Age  : "+age);
        System.out.println("\n");
        for(Book b:bk)
            b.display();
    }
}
