import java.util.List;

public class Order {
    final int orderId;
    final Customer customer;
    final List<Book> books;
    final double totalAmount;

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
            if (book instanceof PhysicalBook) {
                total += ((PhysicalBook) book).getShippingCost();
            }
        }
        return total;
    }

    public void placeOrder() {
        System.out.println("******************************************************************");
        System.out.println("Order placed successfully for " + customer.getName() + ". Total amount: " + String.format("%.2f", totalAmount));
        System.out.println("******************************************************************");
    }

    public void cancelOrder() {
        System.out.println("**************************************************");
        System.out.println("Order cancelled for " + customer.getName() + ".");
        System.out.println("**************************************************");
    }
}
