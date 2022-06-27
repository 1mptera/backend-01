import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LunchWorldCup {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] menuList = new String[]{"피자", "햄버거", "돈까스", "카레", "짜장면",
        "탄탄면", "떡볶이", "파스타", "연어덮밥", "초밥", "라멘", "쌀국수", "곰탕", "국밥",
        "파타이", "텐동", "제육볶음", "쭈꾸미 볶음", "부대찌개", "김치찌개", "우동", "냉면",
        "냉모밀", "국수", "생선구이", "육회비빔밥", "물회국수", "뼈해장국",
        "닭갈비", "마라탕", "샌드위치", "타코"};

    int round = 16;
    /*List<List<String>> menuClasses = new ArrayList<>();
    List<String> menuList2 = new ArrayList<>();

    menuList2.addAll(Arrays.asList(menuList));
    menuClasses.add(menuList2);

    for (int i = 0; i < 4; i += 1) {
      List<String> menuClass = new ArrayList<>();
      menuClasses.add(menuClass);
    }*/


    List<String> menu8thClass = new ArrayList<>();
    List<String> menu4thClass = new ArrayList<>();
    List<String> menu2thClass = new ArrayList<>();
    List<String> finalClass = new ArrayList<>();

    while (round > 0) {
      System.out.println("점심 메뉴 월드컵" + "\n");

      System.out.println("----------------");

      if (round > 1) {
        System.out.println("점심 메뉴 월드컵" + round + "강");
      }
      if (round == 1) {
        System.out.println("점심 메뉴 월드컵 결승전");
      }
      System.out.println("----------------" + "\n");

      System.out.println("선호 하는 메뉴를 선택해주세요.");

      if (round == 16) {
        for (int i = 0; i < round; i += 1) {
          System.out.println("1. " + menuList[i * 2]);
          System.out.println("2. " + menuList[i * 2 + 1]);
          int select = scanner.nextInt();

          if (select == 1) {
            menu8thClass.add(menuList[i * 2]);
          }
          if (select == 2) {
            menu8thClass.add(menuList[i * 2 + 1]);
          }
        }
      }
      if (round == 8) {
        for (int i = 0; i < round; i += 1) {
          System.out.println("1. " + menu8thClass.get(i * 2));
          System.out.println("2. " + menu8thClass.get(i * 2 + 1));
          int select = scanner.nextInt();

          if (select == 1) {
            menu4thClass.add(menu8thClass.get(i * 2));
          }
          if (select == 2) {
            menu4thClass.add(menu8thClass.get(i * 2 + 1));
          }
        }
      }
      if (round == 4) {
        for (int i = 0; i < round; i += 1) {
          System.out.println("1. " + menu4thClass.get(i * 2));
          System.out.println("2. " + menu4thClass.get(i * 2 + 1));
          int select = scanner.nextInt();

          if (select == 1) {
            menu2thClass.add(menu8thClass.get(i * 2));
          }
          if (select == 2) {
            menu2thClass.add(menu8thClass.get(i * 2 + 1));
          }
        }
      }
      if (round == 2) {
        for (int i = 0; i < round; i += 1) {
          System.out.println("1. " + menu2thClass.get(i * 2));
          System.out.println("2. " + menu2thClass.get(i * 2 + 1));
          int select = scanner.nextInt();

          if (select == 1) {
            finalClass.add(menu8thClass.get(i * 2));
          }
          if (select == 2) {
            finalClass.add(menu8thClass.get(i * 2 + 1));
          }
        }
      }
      if (round == 1) {

        System.out.println("1. " + finalClass.get(0));
        System.out.println("2. " + finalClass.get(1));
        int select = scanner.nextInt();

        if (select == 1) {
          System.out.print("오늘의 점심은 " + finalClass.get(0) + "입니다");
          break;
        }
        if (select == 2) {
          System.out.print("오늘의 점심은 " + finalClass.get(1) + "입니다");
          break;
        }
      }
      round /= 2;
    }
  }
}
