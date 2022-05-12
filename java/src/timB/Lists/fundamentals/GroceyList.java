package timB.Lists.fundamentals;

import java.util.ArrayList;

public class GroceyList {

    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public static void main(String[] args) {

    }
    public void printGroceryList(){
        System.out.println("You have: "+groceryList.size() + "items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1)+"."+groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int item, String newItem){
        groceryList.set(item, newItem);
        System.out.println("Grocey item has been modified to "+newItem);
    }
    public void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String item){
        //boolean exists = groceryList.contains(item);
        int position = groceryList.indexOf(item);
        if(position>=0){
            return groceryList.get(position);
        }
        return null;
    }
}
