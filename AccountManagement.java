package cnmxx二;

import java.util.ArrayList;

class Account {
    String accountId;
    String accountHolderName;
    double balance;
    String accountType;

   
    public Account(String accountId, String accountHolderName, double balance, String accountType) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    
    public static void createAccount(ArrayList<Account> accounts, String accountId, String accountHolderName, double balance, String accountType) {
        Account newAccount = new Account(accountId, accountHolderName, balance, accountType);
        accounts.add(newAccount);
        System.out.println("Account created successfully!");
    }

   
    public static void viewBalance(ArrayList<Account> accounts, String accountId) {
        for (Account acc : accounts) {
            if (acc.accountId.equals(accountId)) {
                System.out.println("Balance for account " + acc.accountId + ": $" + acc.balance);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    
    public static void deposit(ArrayList<Account> accounts, String accountId, double amount) {
        for (Account acc : accounts) {
            if (acc.accountId.equals(accountId)) {
                acc.balance += amount;
                System.out.println("Deposit successful! New balance: $" + acc.balance);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    
    public static void withdraw(ArrayList<Account> accounts, String accountId, double amount) {
        for (Account acc : accounts) {
            if (acc.accountId.equals(accountId)) {
                if (acc.balance >= amount) {
                    acc.balance -= amount;
                    System.out.println("Withdrawal successful! New balance: $" + acc.balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                return;
            }
        }
        System.out.println("Account not found!");
    }

   
    public static void transferFunds(ArrayList<Account> accounts, String fromAccountId, String toAccountId, double amount) {
        Account fromAccount = null;
        Account toAccount = null;

        for (Account acc : accounts) {
            if (acc.accountId.equals(fromAccountId)) {
                fromAccount = acc;
            }
            if (acc.accountId.equals(toAccountId)) {
                toAccount = acc;
            }
        }

        if (fromAccount != null && toAccount != null) {
            if (fromAccount.balance >= amount) {
                fromAccount.balance -= amount;
                toAccount.balance += amount;
                System.out.println("Transfer successful!");
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("One or both accounts not found!");
        }
    }
}