//required
// 1. preparation - input - process - output
//   input from csv ,파일에서 가져 온다
//   계좌가 거래내역을 가진게 아니라 따로 처리한다.
// 2. domain model -> account, transaction


import models.Account;
import models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class MakaoBank {
  public static void main(String[] args) {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() {
    // preparation
    Account account = new Account();

    // input
    List<Transaction> transactions = loadTransaction();

    // process
//    List<TransactionResult> transactionResults = account.process(transactions);

    // output
//    saveTransactionResults(transactionResults);
  }

  public List<Transaction> loadTransaction() {

    List<Transaction> transactions = new ArrayList<>();

    Transaction transaction = new Transaction("잔액",1000);
    transactions.add(transaction);
    return transactions;
  }
}
