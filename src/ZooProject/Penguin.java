package ZooProject;

/**
 * Created by nicholashall on 10/12/16.
 */
public class Penguin extends Animal {
    boolean happyFeet;
    public Penguin(boolean n, boolean f){
        super(n);
        setHappyFeet(f);
    }
    void setHappyFeet(boolean f){
        happyFeet = f;
    }
}
