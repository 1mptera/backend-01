public class CodingTest2 {
  public static int solution(int[] a, int[] b) {
    int answer = 1234567890;
    answer = 0;

    for (int i = 0; i < a.length; i += 1) {
      answer += a[i] * b[i];
    }
    return answer;
  }
}
