package list_arraylist_linkedlist_iterator_autoboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if(findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialTransaction);
            this.customers.add(customer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        var customer = this.findCustomer(customerName);
        if(customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(Customer customer:this.customers) {
            if(customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }


}
