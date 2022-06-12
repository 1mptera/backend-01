import java.util.Scanner;

public class LunchMenuWorldCup {
  private final Scanner scanner = new Scanner(System.in);
  private final String[] CONTESTS = new String[]{
      "32강", "16강", "8강", "4강", "결승전!"
  };
  private final String[] MENUS = new String[]{
      "피자", "햄버거", "돈까스", "카레", "짜장면", "탄탄면", "떡볶이", "파스타",
      "연어덮밥", "초밥", "라멘", "쌀국수", "곰탕", "국밥", "팟타이", "텐동",
      "제육볶음", "쭈꾸미볶음", "부대찌개", "김치찌개", "우동", "냉면", "냉모밀", "국수",
      "생선구이", "육회비빔밥", "물회국수", "뼈해장국", "닭갈비", "마라탕", "샌드위치", "타코"
  };
  private boolean[] isValidMenu = {
      true, true, true, true, true, true, true, true,
      true, true, true, true, true, true, true, true,
      true, true, true, true, true, true, true, true,
      true, true, true, true, true, true, true, true,
  };

  private final int EMPTY = -1;

  private String finallySelectedMenu;

  public static void main(String[] args) {
    LunchMenuWorldCup application = new LunchMenuWorldCup();
    application.run();
  }

  public void run() {
    System.out.print("점심 메뉴 월드컵\n\n");

    for (int i = 0; i < CONTESTS.length; i += 1) {
      declareContest(i);
      doContest();
    }

    declareSelectedMenu();
  }

  public void declareContest(int contestIndex) {
    System.out.print("----------------\n");
    System.out.print("점심 메뉴 월드컵 " + CONTESTS[contestIndex] + "\n");
    System.out.print("----------------\n\n");

    System.out.print("선호하는 메뉴를 번호로 선택해주세요.\n\n");
  }

  public void doContest() {
    int candidate1Index = EMPTY;
    int candidate2Index = EMPTY;

    for (int i = 0; i < MENUS.length; i += 1) {
      if (candidate1Index == EMPTY && !isValidMenu[i]) {
        continue;
      }

      if (candidate1Index == EMPTY && isValidMenu[i]) {
        candidate1Index = i;
        continue;
      }

      if (candidate2Index == EMPTY && !isValidMenu[i]) {
        continue;
      }

      if (candidate2Index == EMPTY && isValidMenu[i]) {
        candidate2Index = i;

        compete(candidate1Index, candidate2Index);
      }

      candidate1Index = EMPTY;
      candidate2Index = EMPTY;
    }

    System.out.print("\n");
  }

  public void compete(int candidate1Index, int candidate2Index) {
    int choice = 0;

    while (choice != 1 && choice != 2) {
      System.out.print("1. " + MENUS[candidate1Index] + "\n");
      System.out.print("2. " + MENUS[candidate2Index] + "\n");

      choice = scanner.nextInt();

      switch (choice) {
        case 1 -> isValidMenu[candidate2Index] = false;
        case 2 -> isValidMenu[candidate1Index] = false;
        default -> System.out.print("다시 입력해주세요.\n\n");
      }

      System.out.print("\n");
    }
  }

  public void declareSelectedMenu() {
    for (int i = 0; i < isValidMenu.length; i += 1) {
      if (isValidMenu[i]) {
        finallySelectedMenu = MENUS[i];
      }
    }

    System.out.print("오늘의 점심은 " + finallySelectedMenu + " 입니다.\n");
  }
}
