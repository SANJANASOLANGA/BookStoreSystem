public class Ebook extends Book {
    final String format;

    public Ebook(int id, String title, String author, double price, String format) {
        super(id, title, author, price);
        this.format = format;
    }

    @Override
    public String getDetails() {
        return getTitle() + " by " + getAuthor() + " (Format: " + format + ")";
    }
}

