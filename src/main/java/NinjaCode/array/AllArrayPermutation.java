package NinjaCode.array;

import java.util.ArrayList;
import java.util.List;

public class AllArrayPermutation {

    public List<List<Integer>> findAll(final int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.clear();
            list.add(num);
            permute(nums, out, list);
        }
        return out;
    }

    private void permute(int[] nums, List<List<Integer>> out, List<Integer> list) {
        if(list.size() == nums.length) {
            out.add(new ArrayList<>(list));
            return;
        }
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
                permute(nums, out, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
