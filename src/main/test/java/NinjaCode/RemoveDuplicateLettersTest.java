package NinjaCode;

import NinjaCode.stack.RemoveDuplicateLetters;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicateLettersTest {
    @Test
    public void one() {
        RemoveDuplicateLetters validAnagram = new RemoveDuplicateLetters();
        String result = validAnagram.removeDuplicateLetters("bcabc");
        String expected = "abc";
        Assert.assertEquals(expected, result);
    }
    @Test
    public void two() {
        RemoveDuplicateLetters validAnagram = new RemoveDuplicateLetters();
        String result = validAnagram.removeDuplicateLetters("cbacdcbc");
        String expected = "acdb";
        Assert.assertEquals(expected, result);
    }
}
