// 수련의도
// if문 대신 switch문을 이용하기
// for문 대신 while문 이용하기

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomaNumber {
  private int eachArabiaNumber = 0;

  public static void main(String[] args) {
    RomaNumber application = new RomaNumber();
    application.run();
  }

  public void run() {
    String romaNumber = inputRomaNumber();

    int arabiaNumber = process(romaNumber);

    displayArabiaNumber(arabiaNumber);
  }

  public String inputRomaNumber() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("로마 숫자 : ");
    String romaNumber = scanner.nextLine();
    return romaNumber;
  }

  public int process(String romaNumber) {
    int sumArabiaNumber = 0;

    String[] romaNumberList = romaNumber.split("");
    List<Integer> arabiaNuberList = new ArrayList<>();

    int count = 0;

    while (count != romaNumberList.length) {
      eachArabiaNumber = romaNumberConversion(romaNumberList[count]);

      sumArabiaNumber += eachArabiaNumber;
      arabiaNuberList.add(eachArabiaNumber);

      count += 1;
    }

    count = 0;

    while (count != arabiaNuberList.size() - 1) {
      if (arabiaNuberList.get(count) < arabiaNuberList.get(count + 1)) {
        sumArabiaNumber -= arabiaNuberList.get(count) * 2;
      }

      count += 1;
    }

    return sumArabiaNumber;
  }

  public int romaNumberConversion(String romaNumber) {
    return switch (romaNumber) {
      case "I" -> eachArabiaNumber = 1;
      case "V" -> eachArabiaNumber = 5;
      case "X" -> eachArabiaNumber = 10;
      case "L" -> eachArabiaNumber = 50;
      case "C" -> eachArabiaNumber = 100;
      case "D" -> eachArabiaNumber = 500;
      case "M" -> eachArabiaNumber = 1000;
      default -> eachArabiaNumber = 0;
    };

  }

  public void displayArabiaNumber(int arabiaNumber) {
    System.out.print("아라비아 숫자 : " + arabiaNumber);
  }
}

