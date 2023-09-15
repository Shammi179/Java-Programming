
package TheoryClassAbstract;

public abstract class User {
    protected String id,pass;
    protected User(String i,String p){
        id=i;
        pass=p;
    }
    public String getID(){
        return id;
    }
    public void setID(String i){
        id=i;
    }
    public void setPass(String p){
        pass=p;
    }
    public abstract void display();
}
