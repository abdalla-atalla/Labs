
public class PowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class JUnitTest {

	

	@Test
	void test() {
		JUnitTest test = new JUnitTest();
		int output = test.powerTest(8);
		assertEquals(8,output);
	}

}

class Lab2 {
    boolean powerTest(int x) {
        if (x == 0)
            return false;

        while (x != 1) {
            if (x % 2 != 0)
                return false;
            x = x / 2;
        }
        return true;
    }
}
