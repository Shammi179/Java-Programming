
package TheoryClassAbstract;

public class Student extends User {
    private String sid,sName,status;
    private double cgpa;
    public Student(String id,String pass,String sid,String sName){
        super(id,pass);
        this.sid=sid; this.sName=sName;
    }
    public void setStatus(String s){
        this.status=s;
    }
     public void setCgpa(Double c){
        this.cgpa=c;
    }
      public String getStatus(){
        return status;
    }
       public double getCgpa(){
        return cgpa;
    }
        public String toString2() {
        return "Student{" +
                "user id='" + id + '\'' +
                ", sid='" + sid + '\'' +
                ", sName='" + sName + '\'' +
                ", status='" + status + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString2());
    }
}
