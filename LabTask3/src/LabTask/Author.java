package LabTask;
public class Author {
   private String name,email,gender;
   public Author(){}
   public Author(String n,String e,String g){
       this.name=n;this.email=e;this.gender=g;
   }
   public void displayInfo(){
       System.out.println("Name   : "+name);
       System.out.println("E-mail : "+email);
       System.out.println("Gender : "+gender);
   }
}
