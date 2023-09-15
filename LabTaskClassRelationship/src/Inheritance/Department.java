
package Inheritance;

import java.util.ArrayList;

public class Department {
  private String deptName;
private int deptCode;
public Department(){
}
ArrayList<Teacher> t=new ArrayList<>();
ArrayList<Student> s=new ArrayList<>();
public Department(String deptName,int deptCode){
    this.deptName=deptName; this.deptCode=deptCode;
}
public void setTeacher(Teacher i){
    t.add(i);
}
public void setStudent(Student j){
    s.add(j);
}
public void displayAll(){
    System.out.println("All Information:\n");
    System.out.println("DepartmentName:"+deptName);
    System.out.println("Department Code:"+deptCode);
    for(Teacher teach: t)
    {
        teach.display();
    }
    for(Student stu: s)
    {
        stu.display();
    }
}
    public static void main(String[] args) {
        Department d1=new Department("CSE",213);
        Teacher t1=new Teacher("Kafi",50,"Lecturer","CSE");
        Student s1=new Student("Shammi",19,"12179",3.20);
         Teacher t2=new Teacher("Abdul",60,"Lecturer","CSE");
        Student s2=new Student("Sajal",20,"12381",4.00);
         Teacher t3=new Teacher("Humayun",55,"Professor","CSE");
        Student s3=new Student("Himu",19,"12345",3.53);
        d1.setTeacher(t1);
        d1.setStudent(s1);
        //d1.displayAll();
       d1.setTeacher(t2);
        d1.setStudent(s2);
        //d1.displayAll(); 
        d1.setTeacher(t3);
        d1.setStudent(s3);
        d1.displayAll();
        
        
    }
}
