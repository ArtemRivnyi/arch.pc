public class Replacement {
    private static final String REPLACE_SPACES_REGEX = "\\s+";
    private static final String REPLACEMENT = " ";
    public String replace(String text) {
        return text.replaceAll(REPLACE_SPACES_REGEX, REPLACEMENT);
    }
}
