public class Scrabble {
    public final String input;

    public Scrabble(String input) {
        this.input = input;
    }

    public int score() {
        int totalScore = 0;

        if (input != null && !input.isEmpty()) {
            for (int i = 0; i < input.length(); i++) {
                char letter = input.charAt(i);

                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                        letter == 'l' || letter == 'n' || letter == 'r' || letter == 's' || letter == 't') {
                    totalScore += 1;
                } else if (letter == 'd' || letter == 'g') {
                    totalScore += 2;
                } else if (letter == 'b' || letter == 'c' || letter == 'm' || letter == 'p') {
                    totalScore += 3;
                } else if (letter == 'f' || letter == 'h' || letter == 'v' || letter == 'w' || letter == 'y') {
                    totalScore += 4;
                } else if (letter == 'k') {
                    totalScore += 5;
                } else if (letter == 'j' || letter == 'x') {
                    totalScore += 8;
                } else if (letter == 'q' || letter == 'z') {
                    totalScore += 10;
                }

            }
        }
        return totalScore;
    }
}
