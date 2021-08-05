package NinjaCode;

import NinjaCode.array.TwoSum;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class TwoSumTest {
    @Test
    public void testOne() {
        List<Integer> firstExample = List.of(2,7,11,15);
        List<Integer> expected = List.of(0,1);
        TwoSum twoSum = new TwoSum();
        List<Integer> result = twoSum.perfectSolution(firstExample, 9);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testTwo() {
        List<Integer> firstExample = List.of(3,2,4);
        List<Integer> expected = List.of(1,2);
        TwoSum twoSum = new TwoSum();
        List<Integer> result = twoSum.perfectSolution(firstExample, 6);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testThree() {
        List<Integer> firstExample = List.of(3,3);
        List<Integer> expected = List.of(0,1);
        TwoSum twoSum = new TwoSum();
        List<Integer> result = twoSum.perfectSolution(firstExample, 6);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testFour() {
        List<Integer> firstExample = List.of(3,3);
        List<Integer> expected = List.of(0,1);
        TwoSum twoSum = new TwoSum();
        List<Integer> result = twoSum.perfectSolution(firstExample, 6);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testFive() {
        List<Integer> firstExample = List.of(0,4,3,0);
        List<Integer> expected = List.of(0,3);
        TwoSum twoSum = new TwoSum();
        List<Integer> result = twoSum.perfectSolution(firstExample, 0);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testSix() {
        List<Integer> firstExample = List.of(-1,-2,-3,-4,-5);
        List<Integer> expected = List.of(2,4);
        TwoSum twoSum = new TwoSum();
        List<Integer> result = twoSum.perfectSolution(firstExample, -8);
        Assert.assertEquals(expected, result);
    }
}
