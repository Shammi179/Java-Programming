
package Spring19;

public class User {
    protected String userid,passwd;
    
    public User(){}
    public User(String userid,String passwd){
        this.userid=userid;this.passwd=passwd;
    }
    
    public void display(){
        System.out.println("User's Information:\n\n");
        System.out.println("User ID: "+userid);
    }
    
}
