public class Main {
    public static void main(String[] args) {
        CharactersCounter a = new CharactersCounter("some 22d22 igit,.@.!;s g4ohere 4");
        System.out.format("Numbers: %d, Letters: %d, Special: %d, Space: %d",
                a.getNumbersCounter(),
                a.getLettersOccurrences(),
                a.getSpecialOccurrences(),
                a.getSpaceOccurrences());
    }
}
