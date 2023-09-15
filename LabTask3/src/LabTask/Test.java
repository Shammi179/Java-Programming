package LabTask;
public class Test {
    public static void main(String[] args) {
      Book b1=new Book("ICT",123.4,15);
      Author a1=new Author("Shammi","shumaiya15-12179@diu.edu.bd","Female");
       Author a2=new Author("SAS","Sa123@gmail.com","Male");
      b1.updatePrice(400);
      b1.Setauthor(a1);
      b1.Setauthor(a2);
      b1.display();
    }
}
