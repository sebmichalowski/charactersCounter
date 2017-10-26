import java.util.regex.Pattern;

public class CharactersCounter {
    private final Pattern numbersPattern = Pattern.compile("\\d");
    private final Pattern lettersPattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
    private final Pattern specialPattern = Pattern.compile("[^\\s\\da-z]", Pattern.CASE_INSENSITIVE);
    private final Pattern spacePattern = Pattern.compile("[\\s]");

    private String inputString;
    private int numbersOccurrences;
    private int lettersOccurrences;
    private int specialOccurrences;
    private int spaceOccurrences;

    public CharactersCounter(String inputString) {
        this.inputString = inputString;
        this.numbersOccurrences = countOccurrences(numbersPattern);
        this.lettersOccurrences = countOccurrences(lettersPattern);
        this.specialOccurrences = countOccurrences(specialPattern);
        this.spaceOccurrences = countOccurrences(spacePattern);
    }

    public int getNumbersCounter() {
        return numbersOccurrences;
    }

    public int getLettersOccurrences() {
        return lettersOccurrences;
    }

    public int getSpecialOccurrences() {
        return specialOccurrences;
    }

    public int getSpaceOccurrences() {
        return spaceOccurrences;
    }

    private int countOccurrences(Pattern pattern){
        return 0;
    }
}