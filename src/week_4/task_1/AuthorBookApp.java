package week_4.task_1;

public class AuthorBookApp {
    public  AuthorBookApp(){
        Author author = new Author();

        //compose relation Author in Book
        Book book = new Book("How to code",author,20000);

        //Book object get the attributes of Author
        System.out.println("Name: "+book.getAuthor().getName());
        System.out.println("Age: "+book.getAuthor().getAge());
        System.out.println("Gender: "+book.getAuthor().getGender());

        System.out.println("Book Title: "+book.getTitle());
        System.out.println("Book Price: "+book.getPrice());
    }
}
