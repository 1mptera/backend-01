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
    int arabic = 0;

    for (int i = 0; i < romanNumerals.length(); i += 1) {
      char precedingRoman = romanNumerals.charAt(i);
      int precedingArabic = romanToArabic(precedingRoman);

      char followingRoman = ' ';
      int followingArabic = 0;

      if (i < romanNumerals.length() - 1) {
        followingRoman = romanNumerals.charAt(i + 1);
        followingArabic = romanToArabic(followingRoman);
      }

      arabic += addition(precedingArabic, followingArabic);
    }

    return arabic;
  }

  public int romanToArabic(char roman) {
    return switch (roman) {
      case 'I' -> 1;
      case 'V' -> 5;
      case 'X' -> 10;
      case 'L' -> 50;
      case 'C' -> 100;
      case 'D' -> 500;
      case 'M' -> 1000;
      default -> 0;
    };
  }

  public int addition(int precedingArabic, int followingArabic) {
    if (precedingArabic < followingArabic) {
      precedingArabic *= -1;
    }

    return precedingArabic;
  }

  public void print(int arabic) {
    System.out.println("아라비아 숫자: " + arabic);
  }
}
