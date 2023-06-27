
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrabbleTest {

    @Test
    public void returnsZeroForEmptyWords() {
        Scrabble scrabble = new Scrabble("");
        assertEquals(scrabble.score(), 0);
    }

    @Test
  //  @Disabled
    public void returnsZeroForNull() {
        Scrabble scrabble = new Scrabble(null);
        assertEquals(scrabble.score(), 0);
    }

    @Test
   // @Disabled
    public void returnsScoreForShortWord1() {
        Scrabble scrabble = new Scrabble("a");
        assertEquals(scrabble.score(), 1);
    }

    @Test
    @Disabled
    public void returnsScoreForShortWord2() {
        Scrabble scrabble = new Scrabble("f");
        assertEquals(scrabble.score(), 4);
    }

    @Test
    @Disabled
    public void returnsScoreForSimpleWord() {
        Scrabble scrabble = new Scrabble("street");
        assertEquals(scrabble.score(), 6);
    }

    @Test
    @Disabled
    public void returnsScoreForComplicatedWord() {
        Scrabble scrabble = new Scrabble("quirky");
        assertEquals(scrabble.score(), 22);
    }

    @Test
    @Disabled
    public void returnsScoreForCaseInsensitiveWord() {
        Scrabble scrabble = new Scrabble("OXYPHENBUTAZONE");
        assertEquals(scrabble.score(), 41);
    }

//    @Test
//    @Disabled
//    public void returnsScoreForDoubleWord() {
//        // Scrabble (String, Character[], Character[], boolean (doubleWord), boolean(tripleWord);
//        Scrabble scrabble = new Scrabble("quirky", new Character[]{}, new Character[]{}, true, false);
//        assertEquals(scrabble.score(), 44);
//    }
//
//    @Test
//    @Disabled
//    public void returnsScoreForTripleWord() {
//        Scrabble scrabble = new Scrabble("quirky", new Character[]{}, new Character[]{}, false, true);
//        assertEquals(scrabble.score(), 66);
//    }
//    // Scrabble (String, Character[] (double letters), Character[], boolean, boolean);
//    @Test
//    @Disabled
//    public void returnsScoreForDoubleLetterWord() {
//        Scrabble scrabble = new Scrabble("a", new Character[]{'A'}, new Character[]{}, false, false);
//        assertEquals(scrabble.score(), 2);
//    }
//
//    @Test
//    @Disabled
//    public void returnsScoreForDoubleLetterOnlyOnce() {
//        Scrabble scrabble = new Scrabble("aa", new Character[]{'A'}, new Character[]{}, false, false);
//        assertEquals(scrabble.score(), 3);
//    }
//
//    @Test
//    @Disabled
//    public void returnsScoreForTripleLetterWord() {
//        // Scrabble (String, Character[] , Character[] (triple letters), boolean, boolean;
//        Scrabble scrabble = new Scrabble("a", new Character[]{}, new Character[]{'A'},false, false);
//        assertEquals(scrabble.score(), 3);
//    }
//
//    @Test
//    @Disabled
//    public void returnsScoreForTripleLetterOnlyOnce() {
//        Scrabble scrabble = new Scrabble("aa", new Character[]{}, new Character[]{'A'},false, false);
//        assertEquals(scrabble.score(), 4);
//    }
//
//    @Test
//    @Disabled
//    public void returnsScoreForDoubleAndTripleLetter() {
//        Scrabble scrabble = new Scrabble("aa", new Character[]{'A'}, new Character[]{'A'},false, false);
//        assertEquals(scrabble.score(), 5);
//    }

}
