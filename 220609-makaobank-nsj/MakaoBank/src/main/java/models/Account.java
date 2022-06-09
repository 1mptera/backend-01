package models;

import java.util.ArrayList;
import java.util.List;

public class Account {
  private int amount = 0;

  public List<TransactionResult> process(List<Transaction> transactions) {
    List<TransactionResult> transactionsResults = new ArrayList<>();

    for(Transaction transaction : transactions) {
      amount = transaction.process(amount);
      TransactionResult transactionsResult =
          new TransactionResult(transaction, amount);
      transactionsResults.add(transactionsResult);
    }

    return transactionsResults;
  }
}

