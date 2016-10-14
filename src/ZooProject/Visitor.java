package ZooProject;

import java.util.Scanner;

/**
 * Created by nicholashall on 10/13/16.
 */
public class Visitor extends Person{
    Scanner enter = new Scanner(System.in);
    boolean goldPass;
    public Visitor(String n, boolean gp){
        super(n);
        setGoldPass(gp);
    }
    void setGoldPass(boolean gp){
        goldPass = gp;
    }

    void createPerson(){
        String objectName;
        boolean objectGoldPass;
        System.out.println("What is the Persons name?");
        objectName = enter.nextLine();
        System.out.println("Does The visitor have a GoldPass? true or false");
        objectGoldPass= enter.nextBoolean();
        enter.nextLine();
        Visitor object = new Visitor(objectName,objectGoldPass);
        PersonList.add(object.showInfo());
    }

    public String showInfo() {
        String adEm = super.showInfo() +
                "Visitor "+ "\n"+
                "Has Gold Pass "+ goldPass +"\n";
        return adEm;
    }
}
