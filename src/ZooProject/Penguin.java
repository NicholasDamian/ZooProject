package ZooProject;

import java.util.Scanner;

/**
 * Created by nicholashall on 10/12/16.
 */
public class Penguin extends Animal {
    Scanner enter = new Scanner(System.in);
    boolean happyFeet;
    public Penguin(String gl,boolean n,String na, boolean f){
        super(n,na,gl);
        setHappyFeet(f);
    }
    void setHappyFeet(boolean f){
        happyFeet = f;
    }

    void createAnimal(){
        getLocation();
        String objectName;
        boolean objectNice;
        boolean objectHappyFeet;
        System.out.println("What is the Penguin name?");
        objectName = enter.nextLine();
        System.out.println("Is the Penguin nice? true or false");
        objectNice = enter.nextBoolean();
        System.out.println("Does the Penguin have happy feet? true of false");
        objectHappyFeet = enter.nextBoolean();
        Penguin object = new Penguin(location,objectNice,objectName,objectHappyFeet);
        AnimalList.add(object.showInfo());
    }

    public String getLocation(){
        location = Exhibits.PENGUIN.getLocation();
        return location;
    }

    public String showInfo() {
        String adEm = super.showInfo() +
                "Species Penguin"+"\n"+
                "Has Happy Feet " + happyFeet + "\n";
        return adEm;
    }
}
