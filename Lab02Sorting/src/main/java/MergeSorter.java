import java.util.ArrayList;
public class MergeSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        ArrayList<Integer> array = new ArrayList<>(input); // Створення копії вхідного масиву
        mergeSort(array, 0, array.size() - 1);
        return array;
    }
    private void mergeSort(ArrayList<Integer> array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(array, l, m); // Сортування лівої половини
            mergeSort(array, m + 1, r); // Сортування правої половини
            merge(array, l, m, r); // Об’єднати відсортовані половинки
        }
    }
    private void merge(ArrayList<Integer> array, int x, int j, int r) {
        int n1 = j - x + 1;
        int n2 = r - j;
        ArrayList<Integer> leftArray = new ArrayList<>();
        ArrayList<Integer> rightArray = new ArrayList<>();

        for (int a = 0; a < n1; a++) {
            leftArray.add(array.get(x + a));
        }
        for (int b = 0; b < n2; b++) {
            rightArray.add(array.get(j + 1 + b));
        }
        int c = 0, v = 0;
        int z = x;
        while (c < n1 && v < n2) {
            if (leftArray.get(c) <= rightArray.get(v)) {
                array.set(z, leftArray.get(c));
                c++;
            } else {
                array.set(z, rightArray.get(v));
                v++;
            }
            z++;
        }
        while (c < n1) {
            array.set(z, leftArray.get(c));
            c++;
            z++;
        }
        while (v < n2) {
            array.set(z, rightArray.get(v));
            v++;
            z++;
        }
    }
}
