package util;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryTest {
    public static void main (String[] args) {
        ArrayList<GroceryProduct> meat = new ArrayList<>();
        ArrayList<GroceryProduct> breads = new ArrayList<>();
        ArrayList<GroceryProduct> produce = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to create a grocery list?");
        System.out.println("yes or no?");
        String userInput = scanner.next();

        while (userInput.equals("yes")) {
            System.out.println("Would you like to enter an item?");
            userInput = scanner.next();
            System.out.println("Select a category");
            System.out.println("1. Meats");
            System.out.println("2. Breads");
            System.out.println("3. Produce");
            int userInput3 = scanner.nextInt();
            switch (userInput3) {
                case 1:
                    System.out.println("What kind of meat would you like??");
                    String userInput4 = scanner.next();
                    System.out.println("How many pieces?");
                    int userInput5 = scanner.nextInt();
                    GroceryProduct product = new GroceryProduct(userInput4, userInput5);
                    meat.add(product);
                    System.out.println("Would you like to enter more items?");
                    String userInput6 = scanner.next();
                    if (userInput6.equals("no")) {
                        System.out.println(meat);
                        System.out.println(breads);
                        System.out.println(produce);
                        break;
                    }
                case 2:
                    System.out.println("What kind of bread would you like??");
                    userInput4 = scanner.next();
                    System.out.println("How many pieces?");
                    userInput5 = scanner.nextInt();
                    GroceryProduct product1 = new GroceryProduct(userInput4, userInput5);
                    breads.add(product1);
                    System.out.println("Would you like to enter more items?");
                    userInput6 = scanner.next();
                    if (userInput6.equals("no")) {
                        System.out.println(meat);
                        System.out.println(breads);
                        System.out.println(produce);
                        break;
                    }
                case 3:
                    System.out.println("What kind of produce would you like??");
                    userInput4 = scanner.next();
                    System.out.println("How many pieces?");
                    userInput5 = scanner.nextInt();
                    GroceryProduct product2 = new GroceryProduct(userInput4, userInput5);
                    produce.add(product2);
                    System.out.println("Would you like to enter more items?");
                    userInput6 = scanner.next();
                    if (userInput6.equals("no")) {
                        System.out.println(meat);
                        System.out.println(breads);
                        System.out.println(produce);
                        break;
                    }
            }
        }
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