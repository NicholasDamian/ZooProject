package ZooProject;

/**
 * Created by nicholashall on 10/12/16.
 */
import java.util.Scanner;
public class Menu {
    void Menu(){
        int menuOption;
        Scanner enter = new Scanner(System.in);

        System.out.println("Which of these options would you like to do? Enter the number");
        System.out.println("1.  Create a Animal.");
        System.out.println("2.  Create a Person.");
        System.out.println("3.  Show Animal List.");
        System.out.println("4.  Show Person List.");
        System.out.println("5.  Exit the Program.");
        menuOption = enter.nextInt();
        switch (menuOption){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Please enter a real value");
                Menu();
                break;
        }
    }
}
