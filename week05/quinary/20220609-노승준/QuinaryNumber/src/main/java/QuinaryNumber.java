// 5진수 만들기
// 5진수 만들기
// - 5진수로 변환할 자연수를 입력받는다
// - 입력받은 수를 5로 나눌수 없을 때 까지 반복해서 나눈다.
// - 그 나머지들을 거꾸로 읽은 수가 5진수로 변환한 수 이다.

import java.util.Scanner;

public class QuinaryNumber {
    public static void main(String[] args) {
        QuinaryNumber application = new QuinaryNumber();
        application.run();
    }

    public void run() {

        int naturalNumber = inputNaturalNumber();

        String quinaryNumber = process(naturalNumber);

        displayQuinaryNumber(quinaryNumber);

    }

    public String process(int naturalNumber) {
        int quotient = naturalNumber;

        int remainder = 0;

        String result = "";

        while (quotient >= 5) {
            remainder = quotient % 5;
            result = remainder + result;
            quotient /= 5;
        }

        result = quotient + result;

        return result;
    }

    public int inputNaturalNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");

        int naturalNumber = scanner.nextInt();

        return naturalNumber;
    }

    public void displayQuinaryNumber(String quinaryNumber) {
        System.out.println("5 진수: " + quinaryNumber);
    }
}

