
package Inheritance;

public class Student extends Person{
   private String id;
   private double cgpa;
   //public Student(){}
   public Student(String n,int a,String i,double c){
       super(n,a);
       this.id=i;
       this.cgpa=c;
   }
   public void display(){
       System.out.println("\n\n");
       System.out.println("Name:"+super.name);
       System.out.println("Age:"+super.age);
       System.out.println("ID: "+id);
       System.out.println("CGPA: "+cgpa);
   }
}
