public class fCalc {
    public static long cycleExecute(int b) {
        long result = 1;
        for (int a = 1; a <= b; a++) {
            result *= a;
        }
        return result;
    }
    public static long recursionExecute(int c) {
        if (c == 0 || c == 1) {
            return 1;
        } else {
            return c * recursionExecute(c - 1);
        }
    }
}
