import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write a program that reads a range of integers (start and end point),
        // provided by a user and then from that range prints the sum of the even and odd integers.

        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int evensum = 0;
        int oddsum = 0;

        //for even numbers list
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evensum = evensum + i;
            } else if (i % 2 == 1) {//list of odd
                System.out.println(i + " ");
                oddsum = oddsum + i;
            }
        }
        System.out.println("Even number sum = " + evensum);
        System.out.println("Odd number sum = " + oddsum);
    }


}

