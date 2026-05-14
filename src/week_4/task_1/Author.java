package week_4.task_1;

public class Author {
    private String name;
    private int age;
    private char gender;

    public Author(){
        this.name="Joshua";
        this.age=25;
        this.gender='M';
    }

    public Author(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Author(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
