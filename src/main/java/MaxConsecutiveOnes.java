public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else if (num == 0) {
                if (max < count) {
                    max = count;
                    count = 0;
                }
            }
        }
        return max;
    }
}
