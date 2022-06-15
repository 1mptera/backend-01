import java.util.Scanner;

public class RomanNumber {
  public static void main(String[] args){
    RomanNumber application = new RomanNumber();
    application.run();
  }

  public void run() {
    // 준비, 입력
    Scanner scanner = new Scanner(System.in);

    System.out.print("로마 숫자를 입력해주세요");

    String romanNumber = scanner.nextLine();

    int arabiaNumber = convert(romanNumber);

    System.out.print("아라비아 숫자 : " + arabiaNumber);
  }

  public int convert(String romanNumber) {

    if(romanNumber.equals("I")){
      return 1;
    }
    if(romanNumber.equals("V")){
      return 5;
    }
    if(romanNumber.equals("X")){
      return 10;
    }
    if(romanNumber.equals("L")){
      return 50;
    }
    if(romanNumber.equals("C")){
      return 100;
    }
    if(romanNumber.equals("D")){
      return 500;
    }
    if(romanNumber.equals("M")){
      return 1000;
    }

    return 1;
  }
}
