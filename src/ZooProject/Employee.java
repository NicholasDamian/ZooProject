package ZooProject;

import java.util.Scanner;

/**
 * Created by nicholashall on 10/13/16.
 */
public class Employee extends Person{
    Scanner enter = new Scanner(System.in);
    String position;
    public Employee(String n, String p){
        super(n);
        setPosition(p);
    }
    void setPosition(String p){
        position = p;
    }

    void createPerson(){
        String objectName;
        String objectPosition;
        System.out.println("What is the Persons name?");
        objectName = enter.nextLine();
        System.out.println("Employees position title");
        objectPosition= enter.nextLine();
        Employee object = new Employee(objectName,objectPosition);
        PersonList.add(object.showInfo());
    }

    public String showInfo() {
        String adEm = super.showInfo() +
                "Employee "+ "\n"+
                "Position title "+ position +"\n";
        return adEm;
    }
}
