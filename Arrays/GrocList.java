import java.util.ArrayList;
import java.util.*;

public class GrocList{
    private static Scanner scn=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();
    //here we created the object outside the main method so that it is accessible 
    //for all the methods as well we declared it as static because the main method is a  static method
    //as well if we do nit mention it as a static method then we need to 
    //create an object of class Groclist and then acccesss every emethod of 
    //
    public static void main(String[] args) {

        // GrocList g = new GrocList();
        //  g.groceryList.addGroceryItem(item);
        // GroceryList groceryList=new GroceryList();


        
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("enter your choice" );
            choice = scn.nextInt();
            scn.nextLine();

            switch(choice){
                case 0:
                printInstructions();
                break;

                case 1:
                groceryList.printGroceryList();
                break;

                case 2:
                addItem();
                break;

                case 3:
                modifyItem();
                break;

                case 4:
                removeItem();
                break;

                case 5:
                searchForItem();
                break;

                case 6:
                quit=true;
                break;


            }
        }
    }


    public static void printInstructions(){
        System.out.println("\n press: ");
        System.out.println("\n\t 0- To print choice options.");
        System.out.println("\n\t 1-To print the list of grocery items");
        System.out.println("\n\t 2-To add an array to the list.");
        System.out.println("\n\t 3-To modify an item in the list.");
        System.out.println("\n\t 4-To remove an item from the list.");
        System.out.println("\n\t 5-To search for an item in the list.");
        System.out.println("\n\t 6-To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter a grocery item: ");
        groceryList.addGroceryItem(scn.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number to modify: ");
        int itemNo=scn.nextInt();
        scn.nextLine();
        System.out.println("enter replacement item: ");
        String newItem=scn.nextLine();

        groceryList.modifyGroceryItem(itemNo-1, newItem);
    }

    public static void removeItem(){
        System.out.println("enter item num: ");
        int itemNo=scn.nextInt();
        scn.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem(){
        System.out.println("item to search for: ");
        String searchItem=scn.nextLine();
        if(groceryList.findItem(searchItem)!=null){
            System.out.println("Found "+searchItem + "in our grocery list");

        }else{
            System.out.println(searchItem+"is not in the shoping list");
        }
    }

}

class GroceryList {
    private ArrayList<String> groceryList= new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("you have "+ groceryList.size() + "items in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+ "."+ groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery Item "+ (position+1)+ "has been modified.");
    }

    public void removeGroceryItem(int position){
        String theItem= groceryList.get(position);
        groceryList.remove(position);
    }
    
    public String findItem(String searchItem){
        //boolean exists=groceryList.contains(searchItem);
        int position=groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }
        return null;

    }
}
