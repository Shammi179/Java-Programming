
package TheoryClassAbstract;

public class Test {
    public static void main(String[] args) {
        Faculty f1=new Faculty("123","pass","234","sas","professor");
    f1.display();
    Student s1=new Student("123","as","231","asd");
    s1.setCgpa(2.88);
        s1.setStatus("Sophomore");
    s1.display();
    }  
}
