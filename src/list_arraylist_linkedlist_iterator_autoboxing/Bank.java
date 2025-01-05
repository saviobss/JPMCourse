package list_arraylist_linkedlist_iterator_autoboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if(findBranch(name) == null) {
            Branch branch = new Branch(name);
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        var branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialTransaction);            
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        var branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch (String branchName) {
        for(Branch branch:this.branches) {
            if(branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        var branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            var customerNumber=1;
            for(Customer customer:branch.getCustomers()) {
                System.out.println(String.format("Customer: %s[%d]",customer.getName(),customerNumber));
                if(printTransactions) {
                    var transactionNumber=1;
                    System.out.println("Transactions");
                    for(double transaction:customer.getTransactions()) {
                        System.out.println(String.format("[%d] Amount %.2f",transactionNumber,transaction));
                        transactionNumber++;
                    }
                }
            customerNumber++;
            }
            return true;
        }
        return false;
    }
}
