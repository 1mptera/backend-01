// 0. 10진수를 받는다.
// 1. 10진수를 16진수로 변환한다.
// 2. 변환한 16진수를 출력한다.
// 처리과정
// 주어진 수를 16으로 나눠서 몫이랑 나머지를 구한다.
// 300 -> 12C
//   cycle 1 >> 몫 : 300 / 16 = 18, 나머지 : 300 % 16 = 12 >> C
//   cycle 2 >> 몫 : 18 / 16 = 1,   나머지 : 18 % 16 = 2
//   cycle 3 >> 몫 : 1 / 16 = 0,    나머지 : 1 % 16 = 1
// 나머지가 순차적으로 C, 2, 1이 나왔죠
// C21 나오는 순서대로 일단 저장해놓고, 나중에 12C로 뒤집어주는 연산을 해줘서 정답을 만들 수 있음
// 반복문 이용해서 주어진수를 16으로 몫이 0이 될때까지 나눈다. 그때 생기는 나머지를 스트링 문자열에 저장을 하자

import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. input
        System.out.print("십진수를 입력해주세요: ");
        int decimal = scanner.nextInt();

        // 2. process
        String hexadecimal = "";

        if (decimal == 0) {
            hexadecimal = "0";
        }

        final String ALPHABET = new String("ABCDEF");

        while (decimal > 0) {
            int remainder = decimal % 16;

            String remainderToAlphabet = "";
            remainderToAlphabet = Integer.toString(remainder);

            for (int i = 10; i < 16; i += 1) {
                if (remainder == i) {
                    char alphabetChar = ALPHABET.charAt(i - 10);
                    remainderToAlphabet = Character.toString(alphabetChar);
                }
            }
            hexadecimal += remainderToAlphabet;

            decimal /= 16;
        }

        // 3. output
        System.out.print("16진수: ");
        for (int i = hexadecimal.length() - 1; i >= 0; i -= 1) {
            System.out.print(hexadecimal.charAt(i));
        }
        System.out.println();
    }
}
