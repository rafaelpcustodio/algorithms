import org.junit.Assert;
import org.junit.Test;

public class AlphabeticEncodingDropboxTest {
    @Test
    public void firstSimpleCase() {
        int number = 1;
        AlphabeticEncodingDropbox alphabeticEncodingDropbox = new AlphabeticEncodingDropbox();
        String letter = alphabeticEncodingDropbox.encode(number);
        Assert.assertEquals("A", letter);
    }

    @Test
    public void secondSimpleCase() {
        int number = 26;
        AlphabeticEncodingDropbox alphabeticEncodingDropbox = new AlphabeticEncodingDropbox();
        String letter = alphabeticEncodingDropbox.encode(number);
        Assert.assertEquals("Z", letter);
    }

    @Test
    public void thirdSimpleCaseBiggerThanAlphabetNumber() {
        int number = 27;
        AlphabeticEncodingDropbox alphabeticEncodingDropbox = new AlphabeticEncodingDropbox();
        String letter = alphabeticEncodingDropbox.encode(number);
        Assert.assertEquals("AA", letter);
    }

    @Test
    public void fourthSimpleCaseBiggerThanAlphabetNumber() {
        int number = 51;
        AlphabeticEncodingDropbox alphabeticEncodingDropbox = new AlphabeticEncodingDropbox();
        String letter = alphabeticEncodingDropbox.encode(number);
        Assert.assertEquals("AY", letter);
    }

    @Test
    public void fifthSimpleCaseBiggerThanAlphabetNumber() {
        int number = 54;
        AlphabeticEncodingDropbox alphabeticEncodingDropbox = new AlphabeticEncodingDropbox();
        String letter = alphabeticEncodingDropbox.encode(number);
        Assert.assertEquals("BB", letter);
    }

    @Test
    public void sixthSimpleCaseBiggerThanAlphabetNumber() {
        int number = 79;
        AlphabeticEncodingDropbox alphabeticEncodingDropbox = new AlphabeticEncodingDropbox();
        String letter = alphabeticEncodingDropbox.encode(number);
        Assert.assertEquals("CA", letter);
    }

    @Test
    public void seventhSimpleCaseBiggerThanAlphabetNumber() {
        int number = 702;
        AlphabeticEncodingDropbox alphabeticEncodingDropbox = new AlphabeticEncodingDropbox();
        String letter = alphabeticEncodingDropbox.encode(number);
        Assert.assertEquals("AAA", letter);
    }

    @Test
    public void cornerCase() {
        int number = 0;
        AlphabeticEncodingDropbox alphabeticEncodingDropbox = new AlphabeticEncodingDropbox();
        String letter = alphabeticEncodingDropbox.encode(number);
        Assert.assertNull(letter);
    }
}
