import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanNumber {
  private int arabiaNumber = 0;
  private int arabiaNumberSum = 0;
  public void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("로마 숫자를 입력하세요");
    String romanNumber = scanner.nextLine();


    int arabiaNumber = convert(romanNumber);

    System.out.print("아라비아 숫자" + arabiaNumber);

  }

  public int convert(String romanNumber) {
    String[] romaNumberList = romanNumber.split("");

    List<Integer> arabiaNumberList = new ArrayList<>();

    for (int i = 0; i < romaNumberList.length; i += 1) {
      if (romaNumberList[i].equals("I")) {
        arabiaNumber = 1;
      }
      if (romaNumberList[i].equals("V")) {
        arabiaNumber = 5;
      }
      if (romaNumberList[i].equals("X")) {
        arabiaNumber = 10;
      }
      if (romaNumberList[i].equals("L")) {
        arabiaNumber = 50;
      }
      if (romaNumberList[i].equals("C")) {
        arabiaNumber = 100;
      }
      if (romaNumberList[i].equals("D")) {
        arabiaNumber = 500;
      }
      if (romaNumberList[i].equals("M")) {
        arabiaNumber = 1000;
      }

      arabiaNumberList.add(arabiaNumber);
      arabiaNumberSum += arabiaNumber;
    }
    return arabiaNumberSum;
  }
}
