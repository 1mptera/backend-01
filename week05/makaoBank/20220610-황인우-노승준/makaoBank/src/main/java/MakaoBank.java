// 프로그램의 목적: 거래내역이 있으면 계좌가 거래내역을 처리를 해서 거래내역 처리결과를 만들어낸다
// (거래내역은 어떤 계좌에 속해있는 거니까
// 계좌에서 거래내역을 처리해준다)
//
// 거래내역? 종류("잔액", "입금", "출금"), 금액
// >> 잔액,1000
// >> 입금,200
// >> 출금,300
// 거래내역 처리 -> 입력받아온 거래내역들을 거래내역의 종류에 따라서 잔액이 처리되는 메서드 작성
// 거래내역 처리 결과 -> 처리한 결과값을 새로운 파일에 써나간다.
// >> 거래내역 처리 결과의 형태
// >> 잔액,1000,1000
// >> 입금,200,1200
// >> 출금,300,900
//
// 프로그램의 실행 과정
// - 준비: 계좌를 준비한다.
// - 입력: 거래내역 들이 저장되어 있는 파일을 프로그램에 불러와 변수로 저장한다.
// - 처리: 변수로 저장한 거래내역들을 계좌에서 처리해 거래내역 결과 변수들로 저장한다.
// - 출력: 거래내역 결과 변수들을 새로운 파일로 저장한다.

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
    List<Transaction> transactions = loadTransactions();

    // 처리
    List<TransactionResult> transactionResults = account.process(transactions);

    // 출력
    //saveTransactionResults(transactionResults);
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

    String type = words[0];
    int amount = Integer.parseInt(words[1]);

    return new Transaction(type, amount);
  }
}
