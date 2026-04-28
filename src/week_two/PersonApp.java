package week_two;

import java.util.Scanner;

public class PersonApp {
    public PersonApp(){
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\nSelect input option:");
            System.out.println("1 - Enter name only");
            System.out.println("2 - Enter name and age");
            System.out.println("3 - Enter name, age, and salary");
            System.out.println("0 - Exit");

            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Program terminated");
                break;
            }

            Person person = null;


            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                person = new Person(name);

            } else if (choice == 2) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                person = new Person(name, age);

            } else if (choice == 3) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                person = new Person(name, age, salary);

            } else {
                System.out.println("Invalid choice");
                continue;
            }


            int nextChoice;
            do {
                System.out.println("\n1 - Display details");
                System.out.println("2 - Enter another person");
                System.out.println("0 - Exit");

                System.out.print("Choice: ");
                nextChoice = scanner.nextInt();

                if (nextChoice == 1) {
                    person.display();

                    System.out.println("\n1 - Enter another person");
                    System.out.println("0 - Exit");
                    System.out.print("Choice: ");
                    nextChoice = scanner.nextInt();

                    if (nextChoice == 1) {
                        break; // go back to step 1
                    } else if (nextChoice == 0) {
                        System.out.println("Program terminated");
                        System.exit(0);
                    }

                } else if (nextChoice == 2) {
                    break;

                } else if (nextChoice == 0) {
                    System.out.println("Program terminated");
                    System.exit(0);

                } else {
                    System.out.println("Invalid choice");
                }

            } while (true);

        } while (true);
    }
}
