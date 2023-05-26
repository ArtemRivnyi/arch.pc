import java.util.ArrayList;
import java.util.List;
public class SortingPerformance {
    private static final int[] ARRAY_SIZES = {10, 1000, 10000, 1000000};
    private static final int RANGE = 100;
    public static void main(String[] args) {
        for (int count : ARRAY_SIZES) {
            System.out.println("Розмір масиву: " + count);
            ArrayList<Integer> array = ArrayGenerator.generateArray(count, RANGE);
            array.subList(0, count > 100 ? 50 : count);
            // Вивести перші 50 елементів масиву або всі елементи, якщо <= 100
            for (SortingType type : SortingType.values()) {
                System.out.println("Тип сортування: " + type);
                Sorter sorter = SorterFactory.getSorter(type);
                long startTime = System.currentTimeMillis();
                ArrayList<Integer> sorted = sorter.sort(array);
                long endTime = System.currentTimeMillis();
                printArray(sorted.subList(0, Math.min(50, count)));
                // Вивести перші 50 елементів відсортованого масиву
                System.out.println("Час виконання: " + (endTime - startTime) + " мс");
            }
            System.out.println();
        }
    }
    private static void printArray(List<Integer> array) {
        StringBuilder sb = new StringBuilder();
        int size = array.size();
        for (int a = 0; a < size; a++) {
            sb.append(array.get(a));
            if (a < size - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }
}
