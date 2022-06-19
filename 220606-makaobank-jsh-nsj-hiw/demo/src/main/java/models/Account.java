package models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Transaction> transactionsList;

    public List<Transaction> loadTransactions() {
        // TODO :

        transactionsList = new ArrayList<>();

        return transactionsList;
    }


    public String getTransaction(int index) {
        Transaction oneOfTransaction = transactionsList.get(index);

        return oneOfTransaction.getData();
    }
}
