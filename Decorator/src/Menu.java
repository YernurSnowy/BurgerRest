import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static Burger burger;
    public static void showMainMenu(){
        int command;
        do{
            System.out.println("What would you like?");
            System.out.println("1.Сhoose a burger");
            System.out.println("2.Add extra ingredients");
            System.out.println("3.Final burger");
            System.out.println("4.Exit");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    showBurgerMenu();
                case 2:
                    showIngredientsMenu();
                case 3:
                    System.out.println("Your choice: " + burger.getDescription());
                    System.out.println("Cost: " + burger.getCost() + "$");
            }
        }while (command != 4);
    }

    public static void showBurgerMenu(){
        int command;
        do{
            System.out.println("Choose burger:");
            System.out.println("1.Hamburger (2$)");
            System.out.println("2.Cheeseburger (3$)");
            System.out.println("3.Chickenburger (5$)");
            System.out.println("4.Fishburger (7$)");
            System.out.println("5.Exit");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    burger  = new Hamburger();
                    System.out.println("A good choice!");
                    break;
                case 2:
                    burger  = new Cheeseburger();
                    System.out.println("A good choice!");
                    break;
                case 3:
                    burger  = new Chickenburger();
                    System.out.println("A good choice!");
                    break;
                case 4:
                    burger  = new Fishburger();
                    System.out.println("A good choice!");
                    break;
            }
        }while (command != 5);
    }

    public static void showIngredientsMenu(){
        int command;
        do{
            System.out.println("Choose ingredients:");
            System.out.println("1.Cheese (1$)");
            System.out.println("2.Cutlet (1$)");
            System.out.println("3.Pickles (0.5$)");
            System.out.println("4.Jalapeno (0.5$)");
            System.out.println("5.Exit");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    burger = new Cheese(burger);
                    System.out.println("Cheese was added!");
                    break;
                case 2:
                    burger = new Cutlet(burger);
                    System.out.println("Cutlet was added!");
                    break;
                case 3:
                    burger = new Pickles(burger);
                    System.out.println("Pickles was added!");
                    break;
                case 4:
                    burger = new Jalapeno(burger);
                    System.out.println("Jalapeno was added!");
                    break;
            }
        }while (command != 5);
    }
}
