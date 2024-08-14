package com.codegym.service;

import com.codegym.model.Customer;

import java.util.*;

public class CustomerDAO implements ICustomer {

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John Doe", "johndoe@example.com", "123 Main St"));
        customers.put(2, new Customer(2, "Jane Smith", "janesmith@example.com", "456 Elm St"));
        customers.put(3, new Customer(3, "Mike Johnson", "mikejohnson@example.com", "789 Oak St"));
        customers.put(4, new Customer(4, "Emily Davis", "emilydavis@example.com", "987 Pine St"));
        customers.put(5, new Customer(5, "David Wilson", "davidwilson@example.com", "654 Grand St"));
        customers.put(6, new Customer(6, "Sarah Thompson", "sarathompson@example.com", "321 Maple St"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }


    @Override
    public Customer FindByID(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
