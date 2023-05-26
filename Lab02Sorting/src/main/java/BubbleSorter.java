import java.util.ArrayList;
public class BubbleSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        ArrayList<Integer> array = new ArrayList<>(input); // Створіть копію вхідного масиву
        int size = array.size();
        for (int a = 0; a < size - 1; a++) {
            for (int b = 0; b < size - a - 1; b++) {
                if (array.get(b) > array.get(b + 1)) {
                    // Поміняйте елементи місцями, якщо вони розташовані в неправильному порядку
                    int temp = array.get(b);
                    array.set(b, array.get(b + 1));
                    array.set(b + 1, temp);
                }
            }
        }
        return array;
    }
}
