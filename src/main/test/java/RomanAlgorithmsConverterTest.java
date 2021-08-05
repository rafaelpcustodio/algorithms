import org.junit.Assert;
import org.junit.Test;


public class RomanAlgorithmsConverterTest {

    @Test
    public void firstExample() {
        String number = "X";
        Integer expectedValue = 10;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void secondExample() {
        String number = "I";
        Integer expectedValue = 1;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void thirdExample() {
        String number = "V";
        Integer expectedValue = 5;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void fourthExample() {
        String number = "L";
        Integer expectedValue = 50;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void fifthExample() {
        String number = "C";
        Integer expectedValue = 100;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void sixthExample() {
        String number = "d";
        Integer expectedValue = 500;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void seventhExample() {
        String number = "m";
        Integer expectedValue = 1000;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void eighthExample() {
        String number = "XII";
        Integer expectedValue = 12;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void nineExample() {
        String number = "XXVIII";
        Integer expectedValue = 28;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void tenExample() {
        String number = "MCXXV";
        Integer expectedValue = 1125;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void elevenExample() {
        String number = "XIV";
        Integer expectedValue = 14;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void twelveExample() {
        String number = "XIX";
        Integer expectedValue = 19;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void thirteenExample() {
        String number = "CCCXCIX";
        Integer expectedValue = 399;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void fourteenExample() {
        String number = "CMXCIX";
        Integer expectedValue = 999;
        RomanAlgorithmsConverter romanAlgorithmsConverter = new RomanAlgorithmsConverter();
        Integer result = romanAlgorithmsConverter.convert(number);
        Assert.assertEquals(expectedValue, result);
    }
}
