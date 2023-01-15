import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Write a program to ask a user to enter item they want to buy and the price of that item.
        // Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        // If user give more money program should return a change.
        // Whenever a user done with payments program should say "Thank you for shopping!"
        String shopping;
        System.out.println("Do you want to buy item");
        Scanner input = new Scanner(System.in);
        shopping = input.nextLine();
        while (shopping.equalsIgnoreCase("no")) {
            System.out.println("see you soon");
            break;
        }
        if (shopping.equalsIgnoreCase("yes")) {
            System.out.println("Please enter  the item name");
            String itemName = input.nextLine();
            System.out.println("Please enter  price");
            double itemPrice = input.nextDouble();
            System.out.println("Dear Customer Please give me £" + itemPrice + " for your shopping");
            double useramountgiven = input.nextDouble();
            if (itemPrice == useramountgiven) {
                System.out.println("Thank you you paid full amount ");
            } else if (itemPrice > useramountgiven) {
                System.out.println("your need to pay more " + (itemPrice - useramountgiven));
            } else if (itemPrice < useramountgiven) {
                System.out.println("I need to return you " + (useramountgiven - itemPrice));

            }
            System.out.println("Thank you for shopping!");
        }

    }
}
