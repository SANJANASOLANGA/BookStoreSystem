public class PhysicalBook extends Book {
    final double weight;
    private double shippingCost;

    public PhysicalBook(int id, String title, String author, double price, double weight, double shippingCost) {
        super(id, title, author, price);
        this.weight = weight;
        this.shippingCost = shippingCost;
    }

    @Override
    public String getDetails() {
        return getTitle() + " by " + getAuthor() + " (Weight: " + weight + "kg)";
    }

    public double getShippingCost() {
        return shippingCost;
    }
}

