package week_two;

public class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + name);

        if (age != 0) {
            System.out.println("Age: " + age);
        }

        if (salary != 0) {
            System.out.println("Salary: " + salary);
        }
    }
}
