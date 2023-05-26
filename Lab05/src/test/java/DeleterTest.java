import org.junit.Assert;
import org.junit.Test;

public class DeleterTest {
    private final Deleter sut = new Deleter();

    @Test
    public void testRemoveHtmlTags() {
        String htmlText = "<div>\n<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\nдозволяють отримати з рядка додаткову інформацію.\n<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\nза заданим виразом і знаходить її - він просто повертає\nзнайдений рядок.</p>\n<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n</div>";
        String expectedText = "\nСимволи круглих дужок '(' та ')'. Ці символи\nдозволяють отримати з рядка додаткову інформацію.\nЗазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\nза заданим виразом і знаходить її - він просто повертає\nзнайдений рядок.\nА ось тут посилання, щоб життя медом не здавалося.\n";
        String textWithoutTags = sut.remove(htmlText);
        Assert.assertEquals(expectedText, textWithoutTags);
    }
}
