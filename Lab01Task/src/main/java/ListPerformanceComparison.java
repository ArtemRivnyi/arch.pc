import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {
    private static final int LIST_SIZE = 100000;
    private static final int INSERT_SIZE = 1000;

    public static void main(String[] args) {
        List<Integer> ArrayList = new ArrayList<>();
        List<Integer> LinkedList = new LinkedList<>();
        System.out.println("Розмір списку: " + LIST_SIZE);
        System.out.println("Елементи для вставки: " + INSERT_SIZE);
        // Заповнити список
        fill(ArrayList, LIST_SIZE, "ArrayList");
        fill(LinkedList, LIST_SIZE, "LinkedList");
        // Довільний доступ
        randomAccess(ArrayList, "ArrayList");
        randomAccess(LinkedList, "LinkedList");
        // Послідовний доступ
        sequentialAccess(ArrayList, "ArrayList");
        sequentialAccess(LinkedList, "LinkedList");
        // Вставити на початку
        insertAtBeginning(ArrayList, INSERT_SIZE, "ArrayList");
        insertAtBeginning(LinkedList, INSERT_SIZE, "LinkedList");
        // Вставити в кінці
        insertAtEnd(ArrayList, INSERT_SIZE, "ArrayList");
        insertAtEnd(LinkedList, INSERT_SIZE, "LinkedList");
        // Вставити посередині
        insertInMiddle(ArrayList, INSERT_SIZE, "ArrayList");
        insertInMiddle(LinkedList, INSERT_SIZE, "LinkedList");
    }
    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        for (int a = 0; a < count; a++) {
            list.add((int) (Math.random() * count));
        }
        System.out.printf("Заповнити %s: %d ms\n", listType, System.currentTimeMillis() - time);
    }
    private static void randomAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        for (int b = 0; b < LIST_SIZE; b++) {
            list.get((int) (Math.random() * LIST_SIZE));
        }
        System.out.printf("Довільний доступ в %s: %d ms\n", listType, System.currentTimeMillis() - time);
    }
    private static void sequentialAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        System.out.printf("Послідовний доступ в %s: %d ms\n", listType, System.currentTimeMillis() - time);
    }
    private static void insertAtBeginning(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        for (int c = 0; c < count; c++) {
            list.add(0, c);
        }
        System.out.printf("Вставити на початку %s: %d ms\n", listType, System.currentTimeMillis() - time);
    }
    private static void insertAtEnd(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        for (int v = 0; v < count; v++) {
            list.add(v);
        }
        System.out.printf("Вставити в кінці %s: %d ms\n", listType, System.currentTimeMillis() - time);
    }
    private static void insertInMiddle(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        int middle = LIST_SIZE / 2;
        for (int s = 0; s < count; s++) {
            list.add(middle, s);
        }
        System.out.printf("Вставте посередині %s: %d ms\n", listType, System.currentTimeMillis() - time);
    }
}
