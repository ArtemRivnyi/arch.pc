public class Deleter {
    private static final String REPLACE_HTML_TAGS_REGEX = "<[^>]+>";
    public String remove(String text) {
        return text.replaceAll(REPLACE_HTML_TAGS_REGEX, "");
    }
}
