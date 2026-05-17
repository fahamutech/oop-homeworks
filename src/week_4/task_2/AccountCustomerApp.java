package week_4.task_2;

import java.util.Scanner;

public class AccountCustomerApp {

    public AccountCustomerApp() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer age: ");
        int age = scanner.nextInt();

        Customer customer = new Customer(name, age);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Account Creation Menu ---");
            System.out.println("Select 1 to create a customer account without an initial amount.");
            System.out.println("Select 2 to create a customer account with an initial amount.");
            System.out.println("Select 0 to exit the program.");
            System.out.print("Enter your choice: ");
            int createChoice = scanner.nextInt();

            Account account = null;

            if (createChoice == 0) {
                System.out.println("Exiting program. Goodbye!");
                running = false;
                continue;
            } else if (createChoice == 1) {
                account = new Account(customer);
                System.out.println("Account created successfully for " + customer.getName() + ".");
            } else if (createChoice == 2) {
                System.out.print("Enter initial deposit amount: ");
                double initialAmount = scanner.nextDouble();
                account = new Account(customer, initialAmount);
                System.out.println("Account created successfully for " + customer.getName()
                        + ". Initial balance: " + account.getBalance());
            } else {
                System.out.println("Invalid option. Please try again.");
                continue;
            }

            boolean operationsRunning = true;
            while (operationsRunning) {
                System.out.println("\n--- Account Operations Menu ---");
                System.out.println("Select 1 to check account balance.");
                System.out.println("Select 2 to deposit money.");
                System.out.println("Select 3 to withdraw money.");
                System.out.println("Select 0 to exit.");
                System.out.print("Enter your choice: ");
                int opChoice = scanner.nextInt();

                switch (opChoice) {
                    case 1:
                        System.out.println("Current balance for " + account.getCustomer().getName()
                                + "'s account: " + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Deposit of " + depositAmount
                                + " completed successfully. New balance: " + account.getBalance());
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawal of " + withdrawAmount
                                + " completed successfully. New balance: " + account.getBalance());
                        break;
                    case 0:
                        System.out.println("Exiting program. Goodbye!");
                        operationsRunning = false;
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }

        scanner.close();
    }
}
