// 16진수
// 16진수 만드는 공식 몫 나머지



import java.util.Scanner;
public class Hexadecimal {
    public static void main(String[] args) {
        //입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("10진수를 입력하세요");
        int input = scanner.nextInt();
        int quotient0 = input/16;
        int quotientN = quotient0/16;
        int remainder = input%16 ;
        System.out.println("첫번째 몫"+ quotient0);
        System.out.println("첫번째 나머지" + remainder);

        quotientN =quotient0;

        for(int i = 0; quotientN >= 16; i += 1) {
            quotientN = quotientN/16;
            remainder = remainder%16;
            System.out.println("몫"+ quotientN);
            System.out.println("나머지" + remainder);

        }
        //나온수 배열대로 나열
        // 조건 지정
        String hexadecimalIndex = new String();
        hexadecimalIndex ="123456789ABCDEF"; //char.At 이 부르느 값 나오는거 확인
        /*hexadecimalIndex.charAt(11); //
        System.out.println(hexadecimalIndex.charAt(10)); */




    }
}
