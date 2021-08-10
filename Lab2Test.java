import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTest {

    @Test
    public void isPowerOfTwoTest() {
        int[] testCases = { 1, 2, 4, 0, 3, 1520501 };
        boolean[] expected = { true, true, true, false, false, false };

        for (int i = 0; i < testCases.length; i++) {
            assertEquals(Lab2.isPowerOfTwo(testCases[i]), expected[i]);
        }
    }

}
