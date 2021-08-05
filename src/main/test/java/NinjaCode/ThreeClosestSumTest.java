package NinjaCode;

import NinjaCode.array.ThreeSumClosest;
import org.junit.Assert;
import org.junit.Test;

public class ThreeClosestSumTest {
    @Test
    public void testOne() {
        ThreeSumClosest threeClosestSum = new ThreeSumClosest();
        int result = threeClosestSum.threeSumClosest(new int[]{-1,2,1,-4}, 1);
        Assert.assertEquals(2, result);
    }
}
