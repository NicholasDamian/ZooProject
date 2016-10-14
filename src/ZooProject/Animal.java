package ZooProject;

import java.util.ArrayList;

/**
 * Created by nicholashall on 10/12/16.
 */
public class Animal extends Zoo{
    boolean isItNice;
    String name;
    public Animal(boolean n,String na){
        setIsItNice(n);
        setName(na);
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
        return "Is it Nice?: " + isItNice +"\n" +
                "Name: " + name + "\n";

    }
}
