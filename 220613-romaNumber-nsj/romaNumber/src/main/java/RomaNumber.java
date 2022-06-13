import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomaNumber {
  private int eachArabiaNumber = 0;
  private int sumArabiaNumber = 0;

  public static void main(String[] args) {
    RomaNumber application = new RomaNumber();
    application.run();
  }

  public void run() {
    // 입력
    String romaNumber = inputRomaNumber();

    // 처리
    int arabiaNumber = process(romaNumber);

    // 출력
    displayArabiaNumber(arabiaNumber);
  }

  public String inputRomaNumber() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("로마 숫자 : ");
    String romaNumber = scanner.nextLine();
    return romaNumber;
  }

  public int process(String romaNumber) {
    String[] romaNumberList = romaNumber.split("");

    List<Integer> arabiaNumberList = new ArrayList<>();

    for (int i = 0; i < romaNumberList.length; i += 1) {
      if (romaNumberList[i].equals("I")) {
        eachArabiaNumber = 1;
      }
      if (romaNumberList[i].equals("V")) {
        eachArabiaNumber = 5;
      }
      if (romaNumberList[i].equals("X")) {
        eachArabiaNumber = 10;
      }
      if (romaNumberList[i].equals("L")) {
        eachArabiaNumber = 50;
      }
      if (romaNumberList[i].equals("C")) {
        eachArabiaNumber = 100;
      }
      if (romaNumberList[i].equals("D")) {
        eachArabiaNumber = 500;
      }
      if (romaNumberList[i].equals("M")) {
        eachArabiaNumber = 1000;
      }

      sumArabiaNumber += eachArabiaNumber;
      arabiaNumberList.add(eachArabiaNumber);
    }

    for (int i = 0; i < arabiaNumberList.size() - 1; i += 1) {
      if (arabiaNumberList.get(i) < arabiaNumberList.get(i + 1)) {
        sumArabiaNumber -= arabiaNumberList.get(i) * 2;
      }
    }

    return sumArabiaNumber;
  }

  public void displayArabiaNumber(int arabiaNumber) {
    System.out.print("아라비아 숫자 : " + arabiaNumber);
  }
}

