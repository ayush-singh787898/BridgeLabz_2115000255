import java.util.Scanner;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title of the book: " + title);
        System.out.println("Publication year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String name, String bio, String title, int publicationYear) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class Q04_LibraryManagementWithBookAndAuthors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.print("Enter the publication year of the book: ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the name of the author: ");
        String name = sc.nextLine();
        System.out.print("Enter the bio of the author: ");
        String bio = sc.nextLine();

        Book author = new Author(name, bio, title, year);
        System.out.println("\nBook and Author Details:");
        author.displayInfo();

        sc.close();
    }
}
