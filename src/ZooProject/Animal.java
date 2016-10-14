package ZooProject;

import java.util.ArrayList;

/**
 * Created by nicholashall on 10/12/16.
 */
public class Animal extends Zoo{
    boolean isItNice;
    String name;
    String location;
    public Animal(boolean n,String na,String gl){
        setIsItNice(n);
        setName(na);
        setLocation(gl);
    }
    void setLocation(String l){
        location = l;
    }
    void setIsItNice(boolean n){
        isItNice = n;
    }
    void setName(String na){
        name = na;
    }
    void createAnimal(){
    }
    public String showInfo(){
        return "Location: "+ location + "\n"+
                "Is it Nice?: " + isItNice +"\n" +
                "Name: " + name + "\n";

    }



    public String getLocation(String gl){
        return location;
    }
}
