import java.util.ArrayList;
public class ShellSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        ArrayList<Integer> array = new ArrayList<>(input);
        // Створення копії вхідного масиву
        int size = array.size();
        // Почніть з великого розриву та зменшуйте його, доки розрив не стане 1
        for (int a = size / 2; a > 0; a /= 2) {
            for (int b = a; b < size; b++) {
                int v = array.get(b);
                int c;
                for (c = b; c >= a && array.get(c - a) > v; c -= a) {
                    // Зсув елементів, які перевищують temp, праворуч
                    array.set(c, array.get(c - a));
                }
                array.set(c, v);
            }
        }
        return array;
    }
}
