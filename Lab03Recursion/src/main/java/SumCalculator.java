public class SumCalculator {
    public static int execute(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return execute(a ^ b, (a & b) << 1);
        }
    }
}
