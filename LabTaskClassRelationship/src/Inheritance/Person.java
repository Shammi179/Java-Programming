
package Inheritance;

public class Person {
   protected String name;
   protected int age;
   public Person(String n,int a){
       this.name=n; this.age=a;
   }
   public void display(){
       System.out.println("Name: "+name);
       System.out.println("AGe: "+age);
   }
}
