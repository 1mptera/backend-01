import java.util.Scanner;


public class HexaDecimal {


  public static void main(String[] args) {
    HexaDecimal application = new HexaDecimal();
    application.run();
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);
    //입력
    System.out.print("십진수를 입력해주세요");
    int number = scanner.nextInt();
    //처리
    computeHexa(number);
    //출력
    System.out.print(computeHexa(number));
  }

  public String computeHexa(int number) {

    String hexaDecimalArray = "0123456789ABCDEF";
    String hexaDecimal = "";
      if(number <= 15){
        hexaDecimal = "" + hexaDecimalArray.charAt(number);
      }

      if(number > 15) {
        int quotient = number;

        while (quotient > 0) {

          hexaDecimal =   hexaDecimalArray.charAt(quotient % 16) + hexaDecimal;
          quotient /= 16;
        }
      }
    return hexaDecimal;
  }
}


