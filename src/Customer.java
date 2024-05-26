public class Customer {
    final int id;
    final String name;
    final String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // getters
    public String getName() { return name; }
    public String getEmail() { return email; }

    public String getCustomerInfo() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}
