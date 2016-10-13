package ZooProject;

/**
 * Created by nicholashall on 10/12/16.
 */
public class Gorilla extends Animal {
    double weight;
    public Gorilla(boolean n, double w){
        super(n);
        setWeight(w);
    }
    void setWeight(double w){
        weight = w;
    }
}
