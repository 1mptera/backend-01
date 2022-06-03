import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        //입력
        System.out.print("배열의 한 변 길이: ");

        int length = scanner.nextInt();

        //Guard Clause
        if (length <= 0) {
            System.out.println("잘못된 길이 입력입니다.");

            return;
        }

        //처리
        int[][] spiralArray = new int[length][length];



        //출력
    }
}
