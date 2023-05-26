import java.util.ArrayList;
public class QuickSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        ArrayList<Integer> array = new ArrayList<>(input);
        // Створення копії вхідного масиву
        quickSort(array, 0, array.size() - 1);
        return array;
    }
    private void quickSort(ArrayList<Integer> array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            // Сортування елементів перед опорою
            quickSort(array, pivotIndex + 1, high);
            // Сортування елементів після опори
        }
    }
    private int partition(ArrayList<Integer> array, int deep, int high) {
        int pivot = array.get(high);
        int a = deep - 1;

        for (int b = deep; b < high; b++) {
            if (array.get(b) <= pivot) {
                a++;
                swap(array, a, b);
            }
        }
        swap(array, a + 1, high);
        return a + 1;
    }
    private void swap(ArrayList<Integer> array, int a, int b) {
        int temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }
}
