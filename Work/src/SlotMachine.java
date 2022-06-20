
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    double credit = 5000.0;
    double got = 0.0;

    while(credit >= 1000.0) {
      System.out.println("Want to Play? 1. yes , 2 . no");
      int userInput = scanner.nextInt();
      if (userInput == 2) {
        System.out.print("Bye Bye~~");
        break;
      }

      credit -= 1000.0;
      int[] slotNumber = new int[3];

      int count7;
      for(count7 = 0; count7 < 3; ++count7) {
        slotNumber[count7] = random.nextInt(1, 9);
      }

      count7 = 0;
      int count489 = 0;

      for(int i = 0; i < slotNumber.length; ++i) {
        if (slotNumber[i] == 7) {
          ++count7;
        }

        if (slotNumber[i] == 4 || slotNumber[i] == 8 || slotNumber[i] == 9) {
          ++count489;
        }
      }

      double basicgot = (double)(1000 * (slotNumber[0] + slotNumber[1] + slotNumber[2]) / 20);
      if (count7 == 0 && count489 == 0) {
        got = basicgot;
      }

      if (count7 != 0 || count489 != 0) {
        got = basicgot * Math.pow(4.0, (double)count7) * Math.pow(0.5, (double)count489);
      }

      credit += got;
      System.out.println(slotNumber[0] + "." + slotNumber[1] + "." + slotNumber[2]);
      System.out.println(got);
      System.out.println(credit);
      if (credit >= 10000.0) {
        System.out.print("Winner");
        break;
      }

      if (credit <= 1000.0) {
        System.out.print("Need credit? Go home!");
        break;
      }
    }

  }
}
