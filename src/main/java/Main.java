public class Main {
    public static void main(String[] args) {
        CharactersCounter charactersCounter = new CharactersCounter("some 22d22 igit,.@.!;s g4ohere 4");
        System.out.format("Numbers: %d, Letters: %d, Special: %d, Space: %d",
                charactersCounter.getNumbersCounter(),
                charactersCounter.getLettersOccurrences(),
                charactersCounter.getSpecialOccurrences(),
                charactersCounter.getSpaceOccurrences());
    }
}
