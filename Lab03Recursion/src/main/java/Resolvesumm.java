public class Resolvesumm {
    public static int execute(int a) {
        if (a == 0) {
            return 0;
        } else {
            return a % 10 + execute(a / 10);
        }
    }
}
