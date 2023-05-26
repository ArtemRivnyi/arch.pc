public class Main {
    public static void main(String[] args) {
        int a = 5;
        long fCycle = fCalc.cycleExecute(a);
        long fRecursion = fCalc.recursionExecute(a);
        System.out.println("Факторіал з " + a + ": " + fCycle);
        assert fCycle == fRecursion : "Різні значення";
        // Факторний розрахунок
        int fibonacci = 10;
        int fibonacciCycle = FibonacciCalculator.Cycle(fibonacci);
        int fibonacciRecursion = FibonacciCalculator.Recursion(fibonacci);
        System.out.println("Число Фібоначчі в індексі " + fibonacci + ": " + fibonacciCycle);
        assert fibonacciCycle == fibonacciRecursion : "Різні значення";
        // Розрахунок Фібоначчі
        int num = 12345;
        int digitSum = Resolvesumm.execute(num);
        System.out.println("Сума цифр в " + num + ": " + digitSum);
        // Розрахунок суми цифр
        int c = 5;
        int b = 7;
        int sum = SumCalculator.execute(c, b);
        System.out.println("Сума" + c + " і " + b + ": " + sum);
        // Обчислення суми двох чисел
    }
}
