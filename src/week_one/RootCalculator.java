package week_one;

import java.util.Scanner;

public class RootCalculator {
    Scanner scanner = new Scanner(System.in);
    int choice;

    public RootCalculator(){
        do {
            // Display menu
            System.out.println("\nEnter your choice:");
            System.out.println("1 - Square Root");
            System.out.println("2 - Cube Root");
            System.out.println("0 - Exit");

            System.out.print("Choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number: ");
                double num = scanner.nextDouble();
                double result = Math.sqrt(num);
                System.out.println("Square root is: " + result);

            } else if (choice == 2) {
                System.out.print("Enter a number: ");
                double num = scanner.nextDouble();
                double result = Math.cbrt(num);
                System.out.println("Cube root is: " + result);

            } else if (choice == 0) {
                System.out.println("Program exited");

            } else {
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
            }

        } while (choice != 0);

        scanner.close();
    }

}