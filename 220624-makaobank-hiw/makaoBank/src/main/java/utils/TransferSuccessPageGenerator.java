package utils;

public class TransferSuccessPageGenerator extends PageGenerator {
  public TransferSuccessPageGenerator() {
    super();
  }

  @Override
  public String content() {
    return "    <p>계좌이체 성공!</p>\n";
  }
}
