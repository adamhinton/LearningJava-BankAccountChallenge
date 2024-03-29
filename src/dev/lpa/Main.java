package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BankCustomer bob = new BankCustomer("Bob", new ArrayList<>(List.of(
                new BankAccount(BankAccount.BankAccountType.CHECKING, 1000),
                new BankAccount(BankAccount.BankAccountType.SAVINGS, 4000)
        )));

        System.out.println(bob.toString());

    }
}

class BankAccount{
    enum BankAccountType{
        SAVINGS, CHECKING
    }

    private final BankAccountType bankAccountType;
    private final double balance;

    public BankAccount(BankAccountType bankAccountType, double balance) {
        this.bankAccountType = bankAccountType;
        this.balance = balance;
    }
}

class BankCustomer {

    static int CUSTOMER_ID = 1;
    private final String customerName;
    private final int customerID;
    private final ArrayList<BankAccount> bankAccounts;

    public BankCustomer(String customerName, ArrayList<BankAccount> bankAccounts) {
        this.customerName = customerName;
        this.customerID = CUSTOMER_ID;
        this.bankAccounts = bankAccounts == null ? null : Arrays.copyOf(bankAccounts);
        CUSTOMER_ID ++;
    }
}



// make class BankAccount
// BA fields:
    // type: Savings or Checking
    // Balance: initial dollar amount

// BankCustomer class
    // fields:
        // customerName
        // customerID
        // List of accounts

// Create a couple Customer instances and confirm you can't change a Customer's data at all after it's initialized

// create a subclass of BC and confirm the subclass can't tamper with customer's data either