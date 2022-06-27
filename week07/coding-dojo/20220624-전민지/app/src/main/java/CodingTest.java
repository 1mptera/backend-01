import java.util.Random;

public class CodingTest {
  public int[] solution(int[] lottos, int[] win_nums) {

    Random random = new Random();

    int[] answer = new int[2];

    int[] index = {6, 6, 5, 4, 3, 2, 1};

    int countOfZero = 0;
    int countOfRight = 0;

    for (int i = 0; i < 6; i += 1) {
      if (lottos[i] == 0) {
        countOfZero += 1;
        continue;
      }

      for (int j = 0; j < 6; j += 1) {
        if (lottos[i] == win_nums[j]) {
          countOfRight += 1;
        }
      }
    }

    answer[0] = index[countOfZero + countOfRight];
    answer[1] = index[countOfRight];

    return answer;
  }
}
