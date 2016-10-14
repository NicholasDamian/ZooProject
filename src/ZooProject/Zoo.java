package ZooProject;

/**
 * Created by nicholashall on 10/12/16.
 */
import java.util.ArrayList;
public class Zoo {
    static ArrayList <String> AnimalList = new ArrayList<>();
//    Alligator a1 = new Alligator(true,"hi",6);

    void ShowAnimalList() {
        for(int i = 0; i < AnimalList.size();++i) {
            System.out.println(AnimalList.get(i));
        }
    }

    static ArrayList <String> PersonList = new ArrayList<>();

    void ShowPersonList() {
        for(int i = 0; i < PersonList.size();++i) {
            System.out.println(PersonList.get(i));
        }
    }

}


