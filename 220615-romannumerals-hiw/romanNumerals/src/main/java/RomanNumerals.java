import java.util.Scanner;

public class RomanNumerals {
  public static void main(String[] args) {
    RomanNumerals application = new RomanNumerals();
    application.run();
  }

  public void run() {
    String romanNumerals = input();

    int arabicNumerals = process(romanNumerals);

    print(arabicNumerals);
  }

  public String input() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("로마 숫자: ");

    return scanner.nextLine();
  }

  public int process(String romanNumerals) {
    return switch (romanNumerals) {
      case "I" -> 1;
      case "V" -> 5;
      case "X" -> 10;
      case "L" -> 50;
      case "C" -> 100;
      case "D" -> 500;
      case "M" -> 1000;
      default -> 0;
    };
  }

  public void print(int arabicNumerals) {
    System.out.println("아라비아 숫자: " + arabicNumerals);
  }
}
