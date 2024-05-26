import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some books
        Book ebook = new Ebook(1, "ගම්පෙරළිය", "Martin Wickramasinghe", 1229.99, "PDF");
        Book ebook2 = new Ebook(3, "විරාගය", "Martin Wickramasinghe", 1229.99, "PDF");
        Book physicalBook = new PhysicalBook(2, "මඩොල් දූව", "Martin Wickramasinghe", 1539.99, 0.85, 5.00);

        // Create a customer
        Customer customer = new Customer(1, "Amal Perera", "amalperera@gmail.com");
        Customer customer2 = new Customer(1, "Nimal Amarasinghe", "nimalamarasinghe@gmail.com");

        // Create a shopping cart and add books
        ShoppingCart cart = new ShoppingCart();
        cart.addBook(ebook);
        cart.addBook(ebook2);
        cart.addBook(physicalBook);

        // Show cart items
        cart.showCartItems();

        // Create an order
        List<Book> booksAmal = new ArrayList<>();
        booksAmal.add(ebook);
        booksAmal.add(ebook2);
        booksAmal.add(physicalBook);
        Order order = new Order(1, customer, booksAmal);

        List<Book> booksNimal = new ArrayList<>();
        booksNimal.add(ebook);
        booksNimal.add(ebook2);
        booksNimal.add(physicalBook);
        Order order2 = new Order(2, customer2, booksNimal);

        // Place the order
        order.placeOrder();
        order2.cancelOrder();
    }
}
