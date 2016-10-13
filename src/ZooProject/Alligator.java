package ZooProject;

/**
 * Created by nicholashall on 10/12/16.
 */
import java.util.Scanner;
public class Alligator extends Animal {
    Scanner enter = new Scanner(System.in);
    double length;

    String objectName;
    boolean objectNice;
    double objectLength;


    public Alligator(boolean n,double l){
        super(n);
        setLength(l);
    }
    void setLength(double l){
        length = l;
    }
    void createAlligator(){
        System.out.println("What is the Alligators name?");
        objectName = enter.nextLine();
        System.out.println("Is the Alligator nice? true or false");
        objectNice = enter.nextBoolean();
        System.out.println("What is the length of the Alligator in feet");
        objectLength = enter.nextDouble();

        Alligator objectName = new Alligator(objectNice,objectLength);
    }

}
