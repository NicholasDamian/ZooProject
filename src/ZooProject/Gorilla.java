package ZooProject;

import java.util.Scanner;

/**
 * Created by nicholashall on 10/12/16.
 */
public class Gorilla extends Animal {
    Scanner enter = new Scanner(System.in);
    double weight;
    public Gorilla(String gl,boolean n,String na, double w){
        super(n,na,gl);
        setWeight(w);
    }
    void setWeight(double w){
        weight = w;
    }

    void createAnimal(){
        getLocation();
        String objectName;
        boolean objectNice;
        double objectWeight;
        System.out.println("What is the Gorillas name?");
        objectName = enter.nextLine();
        System.out.println("Is the Gorilla nice? true or false");
        objectNice = enter.nextBoolean();
        System.out.println("What is the weight of the Gorilla in pounds");
        objectWeight = enter.nextDouble();
        enter.nextLine();
        Gorilla object = new Gorilla(location,objectNice,objectName,objectWeight);
        AnimalList.add(object.showInfo());
    }
    public String getLocation(){
        location = Exhibits.GORILLA.getLocation();
        return location;
    }

    public String showInfo() {
        String adEm = super.showInfo() +
                "Species Gorilla  "+ "\n"+
                "Weight "+ weight +"\n";
        return adEm;
    }
}
