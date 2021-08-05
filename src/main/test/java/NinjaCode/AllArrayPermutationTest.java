package NinjaCode;

import NinjaCode.array.AllArrayPermutation;
import org.junit.Test;

public class AllArrayPermutationTest {

    @Test
    public void one() {
        AllArrayPermutation allArrayPermutation = new AllArrayPermutation();
        System.out.println(allArrayPermutation.findAll(new int[] {1,2,3}));
    }
}
