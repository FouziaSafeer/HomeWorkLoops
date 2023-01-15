package homeWorkLoops14Jan;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Create a program that will be asking user to apply for a credit card 10 times.
        // As soon you get an “yes” from a user program should stop asking.
        System.out.println("Do want credit card");
        Scanner input = new Scanner(System.in);
        String anser = input.nextLine();
        if (anser.equalsIgnoreCase("no")) {
            for (int i = 1; i <= 9; i++) {
                if (anser.equalsIgnoreCase("yes"))
                    break;
                {
                    System.out.println("Do want credit card");
                    anser = input.nextLine();
                }
            }
            System.out.println("Wellcome to our cradit card");
        } else {
            System.out.println("Wellcome to our cradit card");
        }
    }
}


