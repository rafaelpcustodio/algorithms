package NinjaCode;

import NinjaCode.stack.FirstUniqueCharInString;
import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharInStringTest {

    @Test
    public void one() {
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        int expected = 0;
        Assert.assertEquals(expected, firstUniqueCharInString.firstUniqChar("leetcode"));

    }

    @Test
    public void two() {
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        int expected = 2;
        Assert.assertEquals(expected, firstUniqueCharInString.firstUniqChar("loveleetcode"));
    }

    @Test
    public void three() {
        FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
        int expected = -1;
        Assert.assertEquals(expected, firstUniqueCharInString.firstUniqChar("aabb"));
    }
}
