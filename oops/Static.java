class Book {
    private String title;
    private String author;
    private double price;

   
    public Book() {
        this.title = "Unknown title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
       
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
   
}

public class Static {
    public static void main(String[] args) {
        // Creating books using constructors
        Book b1 = new Book();
        Book b2 = new Book("1984", "George Orwell", 19.99);
        Book b3 = new Book("Animal Farm", "George Orwell", 9.99);

        // Display details of each book
        System.out.println("Book 1:");
        b1.display();

        System.out.println("Book 2:");
        b2.display();

        System.out.println("Book 3:");
        b3.display();

    }
}
