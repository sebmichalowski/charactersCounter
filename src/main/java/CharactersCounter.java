import java.util.regex.Pattern;

public class CharactersCounter {
    private final Pattern numbersPattern = Pattern.compile("\\d");
    private final Pattern lettersPattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
    private final Pattern specialPattern = Pattern.compile("[^\\s\\da-z]", Pattern.CASE_INSENSITIVE);
    private final Pattern spacePattern = Pattern.compile("[\\s]");
}