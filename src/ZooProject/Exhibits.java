package ZooProject;

/**
 * Created by nicholashall on 10/14/16.
 */
public enum Exhibits {
    GORILLA("Gorilla hideout"),
    PENGUIN("Penguin house"),
    ALLIGATOR("The death hole");

    String location;

    Exhibits(String gl) {
        setLocation(gl);
    }
    void setLocation(String gl){
        this.location = gl;
    }

    public String getLocation(){
        return location;
    }
}
