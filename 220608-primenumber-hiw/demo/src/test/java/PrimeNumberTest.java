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
        assertEquals("소수", testApplication.process(2));
        assertEquals("소수", testApplication.process(3));
        assertEquals("소수 아님", testApplication.process(4));
        assertEquals("소수", testApplication.process(17));
        assertEquals("소수", testApplication.process(7741));
    }

    @Test
    void modularTest() {
        PrimeNumber testApplication1 = new PrimeNumber();
        for (int i = 2; i < 3; i += 1) {
            assertNotEquals(0, testApplication1.modular(3, i));
        }

        PrimeNumber testApplication2 = new PrimeNumber();
        for (int i = 2; i < 17; i += 1) {
            assertNotEquals(0, testApplication2.modular(17, i));
        }

        PrimeNumber testApplication3 = new PrimeNumber();
        for (int i = 2; i < 7741; i += 1) {
            assertNotEquals(0, testApplication3.modular(7741, i));
        }
    }
}
