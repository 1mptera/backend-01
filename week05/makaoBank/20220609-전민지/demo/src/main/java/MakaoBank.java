// static main, non-static run
// 1. 흐름: 준비 - 입력 - 처리 - 출력
//  (1) 준비. 계좌를 준비한다(account. 도메인 모델을 활용)
//  (2) 입력. 거래내역을 따로 관리하고 그 거래내역을 불러오기 한다. (transaction)
//      거래내역은 csv 파일애서 불러올 수 있다.
//  (3) 처리. 불러온 transaction에 대하여 처리한다(process)
//  (4) 출력. 처리한 거래내역 결과를 저장해준다.

import models.Account;
import models.Transaction;
import models.TransactionResult;

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
    // 준비
    Account account = new Account();

    // 입력
    List <Transaction> transactions  = loadTransactions();

    // 처리
    List <TransactionResult> transactionResults = account.process(transactions);
//
//    // 출력
//    saveTransactionResults(transactionResults);
  }

  public List<Transaction> loadTransactions() throws FileNotFoundException {
    List<Transaction> transactions = new ArrayList<>();

    File file = new File("input.csv");

    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();

      Transaction transaction = parseTransaction(line);

      transactions.add(transaction);
    }

    return transactions;
  }

  public Transaction parseTransaction(String text) {
    String[] words = text.split(",");
    int amount = Integer.parseInt(words[1]);
    return new Transaction(words[0], amount);
  }

}
