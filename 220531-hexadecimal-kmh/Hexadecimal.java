// 16진수
// 16진수 만드는 공식 몫 나머지
// 16진수 가장 마지막 몫 + 나머지 나머지 나머지  300 -> 몫 18 나머지 12 몫 1 나머지 2  -> 12(12)
// result += 마지막 몫 + 나머지1 나머지 2 나머지3 (미정) -> 순서  -> 이논리 핵심, 시간 많이드는문제 -> 전부 폐기 reset,
// 베스트 프랙티스 -> 1. 이해하는데도 오래걸리고 (식이 짧다 , 많이 함축) 2. 내 식은 장황, 결과
// 조건 나머지가 10이상이라면 알파베 차엣 통해서 가져와라 -> if 나머지가 10 11 12 13 14 -> 어떻게 더 단순화 시킬수 있을까



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

            +=


        }
        //나온수 배열대로 나열
        // 조건 지정
        String hexadecimalIndex = new String();
        hexadecimalIndex ="123456789ABCDEF"; //char.At 이 부르느 값 나오는거 확인
        /*hexadecimalIndex.charAt(11); //
        System.out.println(hexadecimalIndex.charAt(10)); */




    }
}
