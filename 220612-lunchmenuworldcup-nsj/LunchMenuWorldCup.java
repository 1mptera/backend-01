import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LunchMenuWorldCup {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("점심 메뉴 월드컵 \n");

    int lound = 16;
    String[] loundMenu16 = {"피자", "햄버거", "돈까스", "카레", "짜장면", "탄탄면",
        "떡볶이", "파스타", "연어덮밥", "초밥", "라멘", "쌀국수", "곰탕", "국밥", "파타이",
        "텐동", "제육볶음", "쭈꾸미 볶음", "부대찌개", "김치찌개", "우동", "냉면", "냉모밀",
        "국수", "생선구이", "육회비빔밥", "물회국수", "뼈해장국", "닭갈비", "마라탕", "샌드위치", "타코"};

    List<String> loundMenu8 = new ArrayList<>();
    List<String> loundMenu4 = new ArrayList<>();
    List<String> loundMenu2 = new ArrayList<>();
    List<String> finalLoundMenu = new ArrayList<>();

    while (lound != 1) {
      System.out.println("----------------");
      System.out.println("점심 메뉴 월드컵" + lound + "강");
      System.out.println("---------------- \n");

      System.out.println("선호하는 메뉴를 번호로 선택해주세요. \n");

      if (lound == 16) {
        for (int i = 0; i < lound * 2; i += 1) {
          System.out.println("1. " + loundMenu16[i]);
          i += 1;
          System.out.println("2. " + loundMenu16[i]);
          int resultNumber = scanner.nextInt();

          if (resultNumber == 1) {
            loundMenu8.add(loundMenu16[i - 1]);
          }
          if (resultNumber == 2) {
            loundMenu8.add(loundMenu16[i]);
          }
        }
      }

      if (lound == 8) {
        for (int i = 0; i < lound * 2; i += 1) {
          System.out.println("1. " + loundMenu8.get(i));
          i += 1;
          System.out.println("2. " + loundMenu8.get(i));
          int resultNumber = scanner.nextInt();

          if (resultNumber == 1) {
            loundMenu4.add(loundMenu8.get(i - 1));
          }
          if (resultNumber == 2) {
            loundMenu4.add(loundMenu8.get(i));
          }
        }
      }

      if (lound == 4) {
        for (int i = 0; i < lound * 2; i += 1) {
          System.out.println("1. " + loundMenu4.get(i));
          i += 1;
          System.out.println("2. " + loundMenu4.get(i));
          int resultNumber = scanner.nextInt();

          if (resultNumber == 1) {
            loundMenu2.add(loundMenu4.get(i - 1));
          }
          if (resultNumber == 2) {
            loundMenu2.add(loundMenu4.get(i));
          }
        }
      }

      if (lound == 2) {
        for (int i = 0; i < lound * 2; i += 1) {
          System.out.println("1. " + loundMenu2.get(i));
          i += 1;
          System.out.println("2. " + loundMenu2.get(i));
          int resultNumber = scanner.nextInt();

          if (resultNumber == 1) {
            finalLoundMenu.add(loundMenu2.get(i - 1));
          }
          if (resultNumber == 2) {
            finalLoundMenu.add(loundMenu2.get(i));
          }
        }
      }

      lound /= 2;
    }

    System.out.println("\n----------------");
    System.out.println("점심 메뉴 월드컵 결승전!");
    System.out.println("---------------- \n");

    System.out.println("선호하는 메뉴를 번호로 선택해주세요. \n");

    for (int i = 0; i < lound * 2; i += 1) {
      System.out.println("1. " + finalLoundMenu.get(i));
      i += 1;
      System.out.println("2. " + finalLoundMenu.get(i));
      int resultNumber = scanner.nextInt();
      System.out.println();

      System.out.println("오늘의 점심은 " + finalLoundMenu.get(resultNumber - 1) + " 입니다.");
    }
  }
}

