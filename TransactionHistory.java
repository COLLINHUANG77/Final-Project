package ok2;

import java.util.ArrayList;
import java.util.Date;

class Transaction {
    String transactionId;
    String accountId;
    String transactionType; 
    double amount;
    Date transactionDate;

   
    public Transaction(String transactionId, String accountId, String transactionType, double amount) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = new Date();
    }

   
    public static void addTransaction(ArrayList<Transaction> transactions, String transactionId, String accountId, String transactionType, double amount) {
        Transaction newTransaction = new Transaction(transactionId, accountId, transactionType, amount);
        transactions.add(newTransaction);
        System.out.println("Transaction added successfully!");
    }

   
    public static void viewTransactionHistory(ArrayList<Transaction> transactions, String accountId) {
        System.out.println("Transaction History for Account " + accountId + ":");
        for (Transaction trans : transactions) {
            if (trans.accountId.equals(accountId)) {
                System.out.println("Transaction ID: " + trans.transactionId);
                System.out.println("Type: " + trans.transactionType);
                System.out.println("Amount: $" + trans.amount);
                System.out.println("Date: " + trans.transactionDate);
                System.out.println("-----------------------------");
            }
        }
    }
}
