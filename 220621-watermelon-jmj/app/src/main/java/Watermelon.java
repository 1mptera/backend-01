public class Watermelon {
  public String solution(int n) {
    String answer = "";

    if (n % 2 == 0) {
      for (int i = 0; i < n / 2; i += 1) {
        answer += "수박";
      }
    }
    if (n % 2 != 0) {
      for (int i = 0; i < n / 2; i += 1) {
        answer += "수박";
      }
      answer += "수";
    }
    return answer;
  }
}
