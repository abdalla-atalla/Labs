public class Lab3 {
    public static void main(String args[]) {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                int x = i;
                int y1 = 100 * x + 10;
                int y2 = 5 * x * x + 2;

                System.out.println("[" + i + "]" + "\ty1 " + y1 + "\ty2 " + y2 + "\n");
            }
        }
    }
}
// Self Check #1: Algorithm is O(N^2)