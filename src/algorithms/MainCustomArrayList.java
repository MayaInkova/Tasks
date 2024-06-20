package algorithms;

public class MainCustomArrayList {
    public static void main(String[] args){

        CustomArrayList shoppingList = new CustomArrayList();

        shoppingList.add("Milk");

        shoppingList.add("Honey");

        shoppingList.add("Olives");

        shoppingList.add("Beer");

        shoppingList.remove("Olives");

        System.out.println("We need to buy:");

        for(int i=0; i<shoppingList.getLength(); i++) {

            System.out.println(shoppingList.elementAt(i));

        }

        System.out.println("Do we have to buy Bread? " +

                shoppingList.contains("Bread"));

    }
}
