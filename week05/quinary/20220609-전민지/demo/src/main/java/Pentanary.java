import java.util.Scanner;

public class Pentanary {
    private int naturalNumber;
    private Scanner scanner;
    private String[] pentanaryNumbers;

    public static void main(String[] args) {
        Pentanary application = new Pentanary();
        application.run();
    }

    public void run() {
        // 준비
        scanner = new Scanner(System.in);

        // 입력
        System.out.print("Input: ");
        naturalNumber = scanner.nextInt();

        // 처리
        pentanaryNumbers = process(naturalNumber);

        // 출력
        System.out.println("5진수: " + pentanaryNumbers);
    }

    public String[] process(int naturalNumber) {
        int quotient = 0;
        String[] pentanaryNumbers = new String[]{};

        for(int i = 0; naturalNumber >= 5; i += 1) {
            quotient = naturalNumber / 5;
            pentanaryNumbers[i] = Integer.toString(naturalNumber % 5);
            naturalNumber = quotient;
        }

        if (naturalNumber < 5) {
            pentanaryNumbers[0] = Integer.toString(naturalNumber);
        }
        return pentanaryNumbers;
    }
}
