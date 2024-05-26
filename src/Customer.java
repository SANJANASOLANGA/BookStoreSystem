public class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public String getCustomerInfo() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}
