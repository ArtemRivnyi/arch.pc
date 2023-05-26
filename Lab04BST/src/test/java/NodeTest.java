import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class NodeTest {
    private Node BSD;
    private Map<Integer, String> map;
    @Before
    public void setUp() {
        BSD = new Node();
        map = new HashMap<>();
        int groupNumber = 10;
        // Номер моєї групи
        int end = groupNumber + 20;
        List<Integer> keys = new ArrayList<>();
        for (int i = groupNumber; i < end; i++) {
            keys.add(i);
        }
        Collections.shuffle(keys);
        // Перетасувати клавіші
        for (int key : keys) {
            String value = "Value " + key;
            map.put(key, value);
        }
    }
    @After
    public void tearDown() {
        BSD = null;
        map.clear();
        map = null;
    }
    @Test
    public void InsertElements() {
        fillBSTNode();

        int expectedNodeCount = map.size();
        int actualNodeCount = BSD.getNodeCount();
        Assert.assertEquals(expectedNodeCount, actualNodeCount);
    }
    @Test
    public void SearchExistingElements() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String expectedValue = entry.getValue();
            BSD.enter(key, expectedValue);
            String actualValue = BSD.find(key);
            Assert.assertEquals(expectedValue, actualValue);
        }
    }
    @Test
    public void SearchNonExistentElement() {
        String actualValue = BSD.find(-1);
        Assert.assertNull(actualValue);
    }
    @Test
    public void InsertAndUpdateElements() {
        fillBSTNode();
        int keyToRemove = map.keySet().stream().skip(map.size() / 2).findFirst().orElse(null);
        map.remove(keyToRemove);
        BSD.delete(keyToRemove);
        // Видалити також ключ із структури Node
        String newValue = "Нове значення";
        BSD.enter(keyToRemove, newValue);
        Assert.assertEquals(newValue, BSD.find(keyToRemove));
        int existingKey = map.keySet().stream().findFirst().orElse(null);
        String updatedValue = "Оновлене значення";
        BSD.enter(existingKey, updatedValue);
        Assert.assertEquals(updatedValue, BSD.find(existingKey));
        int expectedNodeCount = map.size() + 2;
        // Облік видаленого ключа та оновленого ключа
        int actualNodeCount = BSD.getNodeCount();
        Assert.assertEquals(expectedNodeCount, actualNodeCount);
        Assert.assertEquals(updatedValue, BSD.find(existingKey));
    }
    @Test
    public void RemoveElement() {
        fillBSTNode();
        int keyToRemove = map.keySet().stream().skip(map.size() / 2).findFirst().orElse(null);
        map.remove(keyToRemove);
        BSD.delete(keyToRemove);
        // Видалити також ключ із структури Node
        int expectedNodeCount = map.size();
        int actualNodeCount = BSD.getNodeCount();
        Assert.assertEquals(expectedNodeCount, actualNodeCount);
        Assert.assertNull(BSD.find(keyToRemove));
    }
    private void fillBSTNode() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            BSD.enter(key, value);
        }
    }
}
