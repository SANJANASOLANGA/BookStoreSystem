# Online Bookstore System

This is a simple online bookstore system built using Java, demonstrating key Object-Oriented Programming (OOP) principles: encapsulation, abstraction, inheritance, and polymorphism.

## Features

- Manage different types of books (eBooks and Physical Books)
- Add books to a shopping cart
- Calculate total cost including shipping for physical books
- Place and cancel orders
- Encapsulation of customer details and order information

## Classes and Key Concepts

### `Book` (Abstract Class)

Defines common attributes and methods for all types of books. Uses encapsulation and abstraction.

### `Ebook` (Subclass of `Book`)

Represents an eBook. Demonstrates inheritance and polymorphism by extending `Book` and overriding the `getDetails()` method.

### `PhysicalBook` (Subclass of `Book`)

Represents a physical book. Adds specific attributes like weight and shipping cost. Demonstrates inheritance and polymorphism by extending `Book` and overriding the `getDetails()` method.

### `Customer`

Encapsulates customer information with private fields and public getter methods.

### `ShoppingCart`

Manages a list of books in the cart. Demonstrates encapsulation by using private fields and public methods to manipulate the cart items and calculate the total cost, including shipping for physical books.

### `Order`

Represents an order placed by a customer. Demonstrates encapsulation by using private fields and public methods to manage the order.

### `Main`

Serves as the entry point of the application. Demonstrates how to create and use instances of the various classes.
