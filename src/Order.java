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
        this.totalAmount = calculateTotalAmount();
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully for " + customer.getName() + ". Total amount: " + totalAmount);
    }

    public void cancelOrder() {
        System.out.println("Order cancelled for " + customer.getName() + ".");
    }
}
