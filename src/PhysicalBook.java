public class PhysicalBook extends Book {
    private double weight;

    public PhysicalBook(int id, String title, String author, double price, double weight, double shippingCost) {
        super(id, title, author, price);
        this.weight = weight;
    }

    @Override
    public String getDetails() {
        return getTitle() + " by " + getAuthor() + " (Weight: " + weight + "kg)";
    }
}

