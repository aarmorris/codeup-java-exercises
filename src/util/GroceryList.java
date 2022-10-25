package util;



import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to create a grocery list?");
        System.out.println("yes or no?");
        String userInput = scanner.next();

        while (userInput.equals("yes")) {
            System.out.println("Would you like to enter an item?");
            String userInput2 = scanner.next();
            System.out.println("Select a category");
            System.out.println("1. Meats");
            System.out.println("2. Breads");
            System.out.println("3. Produce");
            String userInput3 = scanner.next();
            System.out.println("What kind of meat would you like??");
            String userInput4 = scanner.next();
            System.out.println("How many pieces?");
            int userInput5 = scanner.nextInt();
            GroceryProduct product = new GroceryProduct(userInput4, userInput5);
            ArrayList<GroceryProduct> meat = new ArrayList<>();
            meat.add(product);
            System.out.println("Would you like to enter more items?");
            String userInput6 = scanner.next();
        }
//        if (userInput.equals("yes")) {
//            System.out.println("Would you like to enter an item?");
//            String userInput2 = scanner.next();
//            if (userInput2.equals("yes")) {
//                System.out.println("Select a category");
//                System.out.println("1. Meats");
//                System.out.println("2. Breads");
//                System.out.println("3. Produce");
//                String userInput3 = scanner.next();
//                if (userInput3.equals("Meats")) {
//                    System.out.println("What kind of meat would you like?");
//                    String userInput4 = scanner.next();
//                    System.out.println("How many pieces?");
//                    int userInput5 = scanner.nextInt();
//                    GroceryProduct product = new GroceryProduct(userInput4, userInput5);
//                    System.out.println("Would you like to enter more items?");
//                    String userInput6 = scanner.next();
//                    if (userInput6.equals("yes")) {
//                        System.out.println("Go back to categories?");
//                    } else {
//                        product.toString();
//                    }
//                    System.out.println(product.toString());
//                }
////                } else if (userInput3.equals("Breads")) {
////                    System.out.println("What kind of bread would you like?");
////                    String userInput4 = scanner.next();
////                    System.out.println("How many pieces?");
////                    int userInput5 = scanner.nextInt();
////                    GroceryProduct product1 = new GroceryProduct(userInput4, userInput5);
////                    System.out.println(product1.toString());
////                } else if (userInput3.equals("Produce")) {
////                    System.out.println("What kind of produce would you like?");
////                    String userInput4 = scanner.next();
////                    System.out.println("How many pieces?");
////                    int userInput5 = scanner.nextInt();
////                    GroceryProduct product2 = new GroceryProduct(userInput4, userInput5);
////                    System.out.println(product2.toString());
//
//            } else {
//                System.out.println("The end");
//            }
//        } else {
//            System.out.println("The end");
//        }

        ArrayList<GroceryProduct> meat = new ArrayList<>();
        ArrayList<GroceryProduct> breads = new ArrayList<>();
        ArrayList<GroceryProduct> produce = new ArrayList<>();
//
//        Prod a = new Prod("chicken",2);
//        Prod b = new Prod("egg",3);
//        Prod c = new Prod("fish",4);
//        Prod d = new Prod("bread 1",1);
//
//        meat.add(a);
//        meat.add(b);
//        meat.add(c);
//
//        breads.add(d);
//
//        System.out.println("Meat Category: ");
//        System.out.println(meat);
//
//        System.out.println("Bread Category: ");
//        System.out.println(breads);

    }
}

class GroceryProduct {
    private String name;
    private int quantity;

    public GroceryProduct(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "GroceryProd{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}