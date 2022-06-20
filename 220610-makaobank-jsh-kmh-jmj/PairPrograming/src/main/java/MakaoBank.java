//required
// 1. preparation - input - process - output
//   input from csv ,파일에서 가져 온다
//   계좌가 거래내역을 가진게 아니라 따로 처리한다.
// 2. domain model -> account, transaction


import models.Account;
import models.Transaction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakaoBank {
  public static void main(String[] args) throws FileNotFoundException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws FileNotFoundException {
    // preparation
    Account account = new Account();

    // input
    List<Transaction> transactions = loadTransaction();

    // process
//    List<TransactionResult> transactionResults = account.process(transactions);

    // output
//    saveTransactionResults(transactionResults);
  }

  public List<Transaction> loadTransaction() throws FileNotFoundException {


    List<Transaction> transactions = new ArrayList<>();

    File file = new File("Input.csv");

    Scanner scanner = new Scanner(file);

    String line = scanner.nextLine();


    Transaction transaction = parseTransaction(line);

    Transaction transaction2 = new Transaction("잔액", 1000);
    transactions.add(transaction);
    return transactions;
  }

  public Transaction parseTransaction(String text) {
    String[] words = text.split(",");

    int amount = Integer.parseInt(words[1]);
    return new Transaction(words[0], amount);
  }
}
