package LabTask;
public class Test2 {
    public static void main(String[] args) {
        Student s1=new Student("SAMMI",121,19);
      Student s2=new Student("SAMMy",120,20);
       Book b1=new Book("ICT",123.4,1);
       Book b2=new Book("Java",500,58);
      Author a1=new Author("Shammi","shumaiya15-12179@diu.edu.bd","Female");
      Author a2=new Author("SAS","Sa123@gmail.com","Male");
    
      b1.Setauthor(a1);
      s1.buy(b1);
      s1.displayInfo();
      b2.Setauthor(a2);
      s2.buy(b2);
      s2.displayInfo();
    }
}
