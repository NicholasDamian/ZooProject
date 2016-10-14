package ZooProject;

/**
 * Created by nicholashall on 10/12/16.
 */
import java.util.Scanner;
public class Menu {
    void Menu(){
        int menuOption;
        Scanner enter = new Scanner(System.in);
        Zoo z = new Zoo();
        Alligator a = new Alligator(true,"hi",10);
        Gorilla g = new Gorilla(true,"hi",10);
        Penguin p = new Penguin(true,"hi",true);
        Visitor v = new Visitor("hi",true);
        Employee e =new Employee("g","hi");

        System.out.println("Which of these options would you like to do? Enter the number");
        System.out.println("1.  Create a Animal.");
        System.out.println("2.  Create a Person.");
        System.out.println("3.  Show Animal List.");
        System.out.println("4.  Show Person List.");
        System.out.println("5.  Exit the Program.");
        menuOption = enter.nextInt();
        switch (menuOption){
            case 1:

                System.out.println("Would you like to create a");
                System.out.println("1.  Alligator");
                System.out.println("2.  Gorilla");
                System.out.println("3.  Penguin");
                System.out.println("Anything else return to menu");
                menuOption = enter.nextInt();
                switch (menuOption){
                    case 1:
                        int menuLoop = 1;
                        while(menuLoop == 1) {
                            a.createAnimal();
                            System.out.println("Create another? 1 for yes 2 for no");
                            menuLoop = enter.nextInt();
                        }
                        Menu();
                        break;
                    case 2:
                        menuLoop = 1;
                        while(menuLoop == 1) {
                            g.createAnimal();
                            System.out.println("Create another? 1 for yes 2 for no");
                            menuLoop = enter.nextInt();
                        }
                        Menu();
                        break;
                    case 3:
                        menuLoop = 1;
                        while(menuLoop == 1) {
                            p.createAnimal();
                            System.out.println("Create another? 1 for yes 2 for no");
                            menuLoop = enter.nextInt();
                        }
                        Menu();
                        break;
                    default:
                        Menu();
                        break;
                        }
                break;
            case 2:

                System.out.println("Would you like to create a");
                System.out.println("1.  Visitor");
                System.out.println("2.  Employee");
                System.out.println("Anything else return to menu");
                menuOption = enter.nextInt();
                switch (menuOption){
                    case 1:
                        int menuLoop = 1;
                        while(menuLoop == 1) {
                            v.createPerson();
                            System.out.println("Create another? 1 for yes 2 for no");
                            menuLoop = enter.nextInt();
                        }
                        Menu();
                        break;
                    case 2:
                        menuLoop = 1;
                        while(menuLoop == 1) {
                            e.createPerson();
                            System.out.println("Create another? 1 for yes 2 for no");
                            menuLoop = enter.nextInt();
                        }
                        Menu();
                        break;
                    default:
                        Menu();
                        break;
                }
                break;
            case 3:
                z.ShowAnimalList();
                Menu();
                break;
            case 4:
                z.ShowPersonList();
                Menu();
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
