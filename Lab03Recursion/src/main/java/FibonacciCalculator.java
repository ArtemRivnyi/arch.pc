public class FibonacciCalculator {
    public static int Cycle(int c) {
        if (c <= 1) {
            return c;
        }
        int back = 0;
        int now = 1;
        for (int b = 2; b <= c; b++) {
            int next = back + now;
            back = now;
            now = next;
        }
        return now;
    }
    public static int Recursion(int a) {
        if (a <= 1) {
            return a;
        } else {
            return Recursion(a - 1) + Recursion(a - 2);
        }
    }
}
