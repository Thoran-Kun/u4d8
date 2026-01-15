package org.example;

import org.example.entities.Customer;
import org.example.entities.Order;
import org.example.entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1L, "Il Nome della Rosa", "Book", 65.00));
        productList.add(new Product(2L, "Ciuccio", "Baby", 70.00));
        productList.add(new Product(3L, "Il Silmarillion", "Book", 80.00));
        productList.add(new Product(4L, "Harry Potter e la Pietra Filosofale", "Book", 75.00));
        productList.add(new Product(5L, "Il Signore dei passeggini", "Baby", 120.00));
        productList.add(new Product(6L, "La Ragazza con il Tatuaggio del Drago", "Book", 90.00));
        productList.add(new Product(7L, "Il Gioco delle Ombre", "Book", 85.00));
        productList.add(new Product(8L, "La Storia Infinita", "Baby", 100.00));
        productList.add(new Product(9L, "Il Pendolo di Foucault", "Book", 110.00));
        productList.add(new Product(10L, "La Culla Perduta", "Baby", 125.00));
        productList.add(new Product(11L, "maglietta", "Boys", 45.00));
        productList.add(new Product(12L, "calzini", "Boys", 30.50));
        productList.add(new Product(13L, "pantaloni da calcio", "Boys", 20.00));

        List<Customer> customerList = new ArrayList<>();
        Customer c1 = new Customer(1L, "Fabio Carlino", 2);
        Customer c2 = new Customer(2L, "Antonio Todx", 2);
        Customer c3 = new Customer(3L, "Salvatore", 2);
        Customer c4 = new Customer(4L, "Michele", 2);
        Customer c5 = new Customer(5L, "Ermenegildo", 2);
        Customer c6 = new Customer(6L, "Gandalf", 2);
        Customer c7 = new Customer(7L, "Aragorn", 2);
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);
        customerList.add(c6);
        customerList.add(c7);

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1L, "delivered", LocalDate.now(), LocalDate.now().plusDays(3), List.of(productList.get(2)), c1));
        orderList.add(new Order(2L, "delivered", LocalDate.now(), LocalDate.now().plusDays(3), List.of(productList.get(3)), c2));
        orderList.add(new Order(3L, "delivered", LocalDate.now(), LocalDate.now().plusDays(3), List.of(productList.get(1)), c3));
        orderList.add(new Order(4L, "delivered", LocalDate.now(), LocalDate.now().plusDays(3), List.of(productList.get(4)), c4));
        orderList.add(new Order(5L, "delivered", LocalDate.now(), LocalDate.now().plusDays(3), List.of(productList.get(5)), c5));
        orderList.add(new Order(6L, "delivered", LocalDate.now(), LocalDate.now().plusDays(3), List.of(productList.get(6)), c4));
        orderList.add(new Order(7L, "delivered", LocalDate.now(), LocalDate.now().plusDays(3), List.of(productList.get(7)), c4));

        //Esercizio 1
        //Raggruppare gli ordini per cliente utilizzando Stream e Lambda. Crea una mappa in cui la chiave è il cliente
        //e il valore è una lista di ordini effetuata dal quel cliente.
        Map<Customer, List<Order>> ordineCliente = orderList.stream().collect(Collectors.groupingBy(c -> c.getCustomer()));
        System.out.println(ordineCliente);

        //Esercizio 2 
    }
}
