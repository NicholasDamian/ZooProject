package ZooProject;

/**
 * Created by nicholashall on 10/13/16.
 */
public class Person extends Zoo{
    String name;

    public Person(String n){
        setName(n);
    }

    void setName(String n){
        name = n;
    }
    void createPerson(){
    }
    public String showInfo(){
        return "Name: " + name + "\n";

    }
}
