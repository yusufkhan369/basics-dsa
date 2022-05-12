package timB.Lists.fundamentals;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceyList groceyList= new GroceyList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice =0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceyList.printGroceryList();
                    break;
                case 2:
                    groceyList.addGroceryItem("U");
                    break;
                case 3:
                    groceyList.modifyGroceryItem(1,"D");
                    break;
                case 4:
                    groceyList.removeGroceryItem(1);
                    break;
                case 5:
                    groceyList.findItem("S");
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    private static void printInstructions() {
        System.out.println("enter number");
    }
}
