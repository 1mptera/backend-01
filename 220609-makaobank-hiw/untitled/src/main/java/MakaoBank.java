// 프로그램의 목적: 거래 내역 파일을 받아서 거래 내역 결과 파일을 생성한다.
//
// 프로그램 수행을 위해 필요한 요소
// - 거래 내역: 거래 종류, 거래 금액
// - 계좌: 거래 내역을 받아서 거래 내역 결과를 생성하기 위한 처리를 함
//
// 프로그램의 수행 순서
// - 입력: 거래 내역 파일로부터 거래 내역을 가져옴
// - 처리: 가져온 거래 내역을 계좌로 불러와 처리하여 거래 내역 결과를 생성
// - 출력: 생성된 거래 내역 결과를 거래 내역 결과 파일로 저장

import models.Account;
import models.Transaction;

import java.util.List;

public class MakaoBank {
  public static void main(String[] args) {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() {
    Account myAccount = new Account();

    List<Transaction> transactions = loadTransactions();

    List<TransactionResult> transactionResults = myAccount.process(transactionList);

    saveTransactionResults(transactionResults);
  }
}
