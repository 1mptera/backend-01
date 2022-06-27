package models;

import java.util.ArrayList;
import java.util.List;

public class Account {
  public List<TransactionResult> process(List<Transaction> transactions) {
    List<TransactionResult> transactionResults = new ArrayList<>();

    int result = 0;

    for (Transaction transaction : transactions) {
      String type = transaction.getType();
      int amount = transaction.getAmount();

      result = switch (type) {
        case "잔액" -> amount;
        case "입금" -> result + amount;
        case "출금" -> result - amount;
        default -> Integer.MIN_VALUE;
      };

      TransactionResult transactionResult = new TransactionResult(transaction, result);

      transactionResults.add(transactionResult);
    }

    return transactionResults;
  }
}
