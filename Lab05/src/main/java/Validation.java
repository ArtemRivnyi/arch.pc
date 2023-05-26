public class Validation {
    private static final String PHONE_NUMBER_REGEX = "^\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}$";
    public boolean validate(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }
}
