import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addBook(Book book) {
        cartItems.add(book);
    }

    public void removeBook(Book book) {
        cartItems.remove(book);
    }

    public double calculateTotal() {
        double total = 0;
        for (Book book : cartItems) {
            total += book.getPrice();
        }
        return total;
    }

    public void showCartItems() {
        for (Book book : cartItems) {
            System.out.println(book.getDetails());
        }
    }
}

