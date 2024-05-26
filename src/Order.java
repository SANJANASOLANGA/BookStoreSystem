import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Book> books;
    private double totalAmount;

    public Order(int orderId, Customer customer, List<Book> books) {
        this.orderId = orderId;
        this.customer = customer;
        this.books = books;
    }

}
