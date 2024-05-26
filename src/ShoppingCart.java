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


}

