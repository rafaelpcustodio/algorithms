package NinjaCode;

import NinjaCode.string.ValidAnagram;
import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest {
    @Test
    public void one() {
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isAnagramPerfectSolution("anagram", "nagaram");
        Assert.assertTrue(result);
    }
    @Test
    public void two() {
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isAnagramPerfectSolution("rat", "car");
        Assert.assertFalse(result);
    }
    @Test
    public void three() {
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isAnagramPerfectSolution("rat", "atr");
        Assert.assertTrue(result);
    }
    @Test
    public void four() {
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isAnagramPerfectSolution("ac", "bb");
        Assert.assertFalse(result);
    }
}
