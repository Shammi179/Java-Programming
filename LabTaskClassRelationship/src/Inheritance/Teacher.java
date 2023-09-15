
package Inheritance;

public class Teacher extends Person{
   private String designation,dept;
  // public Teacher(){}
   public Teacher(String n,int a,String dsg,String dpt){
       super(n,a);
       this.designation=dsg; this.dept=dpt;
   }
   public void display(){
       System.out.println("\n\n");
       System.out.println("Name:"+super.name);
       System.out.println("Age:"+super.age);
       System.out.println("Designation: "+designation);
       System.out.println("Department: "+dept);
   }
}
