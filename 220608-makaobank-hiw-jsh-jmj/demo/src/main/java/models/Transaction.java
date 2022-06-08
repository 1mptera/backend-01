package models;

import java.util.Objects;

public class Transaction {
    private final String type;
    private final int amount;

    //TODO : 거래내역 관리(입금, 출금 + 금액까지)
    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object other) {
        Transaction otherTransaction = (Transaction) other;
        return Objects.equals(this.type, otherTransaction.type) &&
                this.amount == otherTransaction.amount;
    }
    @Override
    public String toString() {
        return "" + this.type + " " + this.amount;
    }
}
