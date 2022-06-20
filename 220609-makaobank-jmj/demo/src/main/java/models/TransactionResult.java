// 1. 거래 내역과 잔액을 들고 있게 한다.
//  > 또는 거래 내역을 참조하고, 잔액만 들고 있는다. => 이 방식을 선택

package models;

public class TransactionResult {

  private Transaction transaction;
  private int amount;

  public TransactionResult(Transaction transaction, int amount) {

    this.transaction = transaction;
    this.amount = amount;
  }

  public String[] values() {
    return new String[]{
        transaction.type(),
        transaction.amount().toString(),
        Integer.toString(amount)};
  }
}
