import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some books
        Book ebook = new Ebook(1, "ගම්පෙරළිය", "Martin Wickramasinghe", 1229.99, "PDF");
        Book physicalBook = new PhysicalBook(2, "මඩොල් දූව", "Martin Wickramasinghe", 1539.99, 0.85, 5.00);

        // Create a customer
        Customer customer = new Customer(1, "Alice Smith", "alice.smith@example.com");

        // Create a shopping cart and add books
        ShoppingCart cart = new ShoppingCart();
        cart.addBook(ebook);
        cart.addBook(physicalBook);


    }
}
