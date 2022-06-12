import java.util.Scanner;

public class LunchMenuWorldCup {
  public static void main(String[] args) {
    // 준비
    Scanner scanner = new Scanner(System.in);
    String[] lunchMenus = new String[]{"피자", "햄버거", "돈까스", "카레", "짜장면",
        "탄탄면", "떡볶이", "파스타", "연어덮밥", "초밥", "라멘", "쌀국수", "곰탕", "국밥",
        "파타이", "텐동", "제육볶음", "쭈꾸미 볶음", "부대찌개", "김치찌개", "우동", "냉면",
        "냉모밀", "국수", "생선구이", "육회비빔밥", "물회국수", "뼈해장국", "닭갈비", "마라탕",
        "샌드위치", "타코"};

    // 메인 루프
    int round = 16;
    String[] updatedMenuLists = new String[round];

    while (round > 0) {
      System.out.println("점심 메뉴 월드컵" + "\n");
      System.out.println("--------------------");
      if (round >= 2) {
        System.out.println("점심 메뉴 월드컵 " + round + "강");
      }
      if (round < 2) {
        System.out.println("점심 메뉴 월드컵 결승전!");
      }
      System.out.println("--------------------" + "\n");
      System.out.println("선호하는 메뉴를 번호로 선택해주세요.");

      for (int i = 0; i < round; i += 1) {
        System.out.println("1. " + lunchMenus[2 * i]);
        System.out.println("2. " + lunchMenus[2 * i + 1]);
        int chosenNumber = scanner.nextInt();

        if (chosenNumber == 1) {
          updatedMenuLists[i] = lunchMenus[2 * i];
        }

        if (chosenNumber == 2) {
          updatedMenuLists[i] = lunchMenus[2 * i + 1];
        }
      }

      round /= 2;
      lunchMenus = updatedMenuLists;

      if (round == 0) {
        System.out.println();
        System.out.println("오늘의 점심은 " + lunchMenus[0] + "입니다.");
        break;
      }
    }
  }
}
