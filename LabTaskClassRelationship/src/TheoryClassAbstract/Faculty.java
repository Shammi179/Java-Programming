
package TheoryClassAbstract;

public class Faculty extends User {
    private String fid,fName,position;
    public Faculty(String id,String pass,String fid,String fName,String position){
        super(id,pass);this.fid=fid;this.fName=fName;this.position=position;
    }
    public void setPosition(String p){
        position=p;
    }
    public String toString1() {
        return "Faculty{user id='"+ id +'\''+", fid='" + fid +'\''+", fname='" + fName +'\''+", position='" + position + '\'' +
                '}';
    }
    @Override
    public void display(){
        System.out.println(toString1());;
    }
}
