import org.junit.Assert;
import org.junit.Test;

public class ValidationTest {
    private final Validation sut = new Validation();

    @Test
    public void testValidPhoneNumber() {
        String phoneNumber = "(+380)50-333-33-33";
        Assert.assertTrue(sut.validate(phoneNumber));
    }

    @Test
    public void testInvalidPhoneNumber() {
        String phoneNumber = "(+380)50-3333-33-33";
        Assert.assertFalse(sut.validate(phoneNumber));
        // Неправильний формат, 4 цифри замість 3
    }
}
