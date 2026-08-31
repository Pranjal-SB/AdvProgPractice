class Book {
    String title;
    String author;
    double price;
}

public class Q2_Book {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Programming";
        b1.author = "James Gosling";
        b1.price = 450.0;

        System.out.println("Title  : " + b1.title);
        System.out.println("Author : " + b1.author);
        System.out.println("Price  : " + b1.price);
    }
}
