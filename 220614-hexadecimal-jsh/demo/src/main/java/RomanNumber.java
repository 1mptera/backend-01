import java.util.Scanner;

public class RomanNumber {
  public void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("로마 숫자를 입력하세요");
    String romanNumber = scanner.nextLine();


    int arabiaNumber = convert(romanNumber);

    System.out.print("아라비아 숫자" + arabiaNumber);

  }

  public int convert(String romanNumber) {
    if(romanNumber.equals("I")){
      return 1;
    }
    if(romanNumber.equals("L")){
      return 50;
    }
    return 0;
  }
}
