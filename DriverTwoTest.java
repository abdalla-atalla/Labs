package lab4;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverTwoTest {
    DriverTwo tester = new DriverTwo();
    String k = "k";
    String x = "x";

    @Test
    void testAddOrChangeEntry() {
        assertEquals(tester.addOrChangeEntry(k, x), "addOrChangeEntry()", "method called");
    }

    @Test
    void testRemoveEntry() {
        assertEquals(tester.removeEntry(k), "removeEntry()", "method called");
    }

}