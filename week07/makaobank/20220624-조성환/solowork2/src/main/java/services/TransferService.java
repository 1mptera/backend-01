package services;

import models.Account;

import java.util.ArrayList;
import java.util.List;

public class TransferService {


  private final List<Account> accounts;

  public TransferService(List<Account> accounts) {
    this.accounts = new ArrayList<>(accounts);
  }

  public void transfer(String from, String to, int amount) {
    Account sender = accounts.stream().filter(          // 필터를 통해서 sender와 같은 계좌번호를 가지고 있는 계좌를 찾기
            account -> account.identifier().equals(from))
            .findFirst().get();
    Account receiver = accounts.stream().filter(        // 필터를 통해서 receiver와 같은 계좌번호를 가지고 있는 계좌를 찾기
            account -> account.identifier().equals(to))
        .findFirst().get();

    sender.transfer(receiver , amount);
  }
}
