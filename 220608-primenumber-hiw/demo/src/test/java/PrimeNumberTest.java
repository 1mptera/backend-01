import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void getInputTest() {
        PrimeNumber testApplication = new PrimeNumber();

        //getInput()이 반환하는 변수가 Integer형인지 확인하는
        //assert method를 찾고자 했으나 찾지 못했습니다.
    }

    @Test
    void processTest() {
        PrimeNumber testApplication = new PrimeNumber();
        assertEquals("소수 아님", testApplication.process(1));
    }
}