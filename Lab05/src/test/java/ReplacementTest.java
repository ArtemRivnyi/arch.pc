import org.junit.Assert;
import org.junit.Test;

public class ReplacementTest {
    private final Replacement sut = new Replacement();

    @Test
    public void testReplaceMultipleSpaces() {
        String text = "Я хочу    бути     програмістом";
        String expectedText = "Я хочу бути програмістом";
        String replacedText = sut.replace(text);
        Assert.assertEquals(expectedText, replacedText);
    }
}
