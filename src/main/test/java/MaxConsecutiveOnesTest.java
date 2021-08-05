import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {
    @Test
    public void testWithZeros() {
        int[] nums = {0,0,0};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int received = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        Assert.assertEquals(0, received);
    }

    @Test
    public void testWithOnes() {
        int[] nums = {1,1,1};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int received = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        Assert.assertEquals(3, received);
    }

    @Test
    public void testWithSimpleCase() {
        int[] nums = {1,1,1,0,1,1};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int received = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        Assert.assertEquals(3, received);
    }
}
