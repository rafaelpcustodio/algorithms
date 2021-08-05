package NinjaCode;

import NinjaCode.string.LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    @Test
    public void one() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] string = new String[]{"flower","flow","flight"};
        String result = longestCommonPrefix.perfectSolution(string);
        Assert.assertEquals("fl", result);
    }

    @Test
    public void two() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] string = new String[]{"dog","racecar","car"};
        String result = longestCommonPrefix.perfectSolution(string);
        Assert.assertEquals("", result);
    }

    @Test
    public void three() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] string = new String[]{"abca","aba","aaab"};
        String result = longestCommonPrefix.perfectSolution(string);
        Assert.assertEquals("a", result);
    }
}
