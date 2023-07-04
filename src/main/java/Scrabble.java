public class Scrabble {
    public final String input;

    private static final int[] letterValues = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

    public Scrabble(String input) {
        this.input = (input != null && !input.isEmpty() ? input.toLowerCase() : "");
    }

    public int score() {
        int totalScore = 0;

            for (char c : input.toCharArray()) {
            int charIndex = c - 'a';                  // Retrieving index by deducting Unicode value of char c
            if (charIndex >= 0 && charIndex < letterValues.length) {   // Checking that index is valid within range of letterValues array
                totalScore += letterValues[charIndex];
            }
        }

        return totalScore;
    }
}
