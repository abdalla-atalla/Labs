package lab4;

import org.testng.annotations.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverOneTest {
    ArrayList<String> list = new ArrayList<String>();
    String x = "hello";
    String y = "world";
    DriverOne tester = new DriverOne();

    @Test
    public void testReplace() {
        assertEquals(tester.replace(list, x, y), "replace called", "replace() method should be called");
    }

    @Test
    public void testDelete() {
        assertEquals(tester.delete(list, y), "delete called", "delete() method should be called");
    }
}