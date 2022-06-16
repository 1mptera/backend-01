import java.util.Scanner;

public class HexaDecimal {
  private String hexaDecimal = "";

  public static void main(String[] args){
    HexaDecimal application = new HexaDecimal();
    application.run();
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("십진수를 입력해주세요");
    int number = scanner.nextInt();

    String hexaDecimal = "";
       hexaDecimal =  compute(number);

    System.out.print(hexaDecimal);
  }

  public String compute(int number) {

    String hexaDecimalArray = "0123456789ABCDEF";

    return hexaDecimal + hexaDecimalArray.charAt(number);
  }
}
