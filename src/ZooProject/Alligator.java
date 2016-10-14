package ZooProject;

/**
 * Created by nicholashall on 10/12/16.
 */
import java.util.Scanner;
public class Alligator extends Animal {
    Scanner enter = new Scanner(System.in);
    double length;

//    String objectName;
//    boolean objectNice;
//    double objectLength;


    public Alligator(boolean n,String na,double l){
        super(n,na);
        setLength(l);
    }
    void setLength(double l){
        length = l;
    }
    void createAnimal(){
        String objectName;
        boolean objectNice;
        double objectLength;
        System.out.println("What is the Alligators name?");
        objectName = enter.nextLine();
        System.out.println("Is the Alligator nice? true or false");
        objectNice = enter.nextBoolean();
        System.out.println("What is the length of the Alligator in feet");
        objectLength = enter.nextDouble();
        enter.nextLine();
        Alligator object = new Alligator(objectNice,objectName,objectLength);
        AnimalList.add(object.showInfo());
    }

    public String showInfo(){
        String adEm = super.showInfo()+
                "Species Alligator" + "\n"+
                "Length: " + length + "\n";
        return adEm;

    }

}
