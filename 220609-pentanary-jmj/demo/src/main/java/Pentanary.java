import java.util.Scanner;

public class Pentanary {
    private int naturalNumber;

    public static void main(String[] args) {
        Pentanary application = new Pentanary();
        application.run();
    }

    public void run() {
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("Input: ");
        naturalNumber = scanner.nextInt();

        // 처리
        int pentanary = process(naturalNumber);

        // 출력
        System.out.println("5진수: " + pentanary);
    }

    public int process(int naturalNumber) {
        return 0;
    }
}
