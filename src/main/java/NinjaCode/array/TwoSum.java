package NinjaCode.array;

import java.util.*;
import java.util.stream.Collectors;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {
    // my solution fail with negatives
    public List<Integer> calculate(List<Integer> nums, int target) {
        if(nums == null || nums.isEmpty() || nums.size() == 1) return Collections.emptyList();
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            if(target >= 0 && map.containsKey(target - nums.get(i))) {
                answer.add(map.get(target - nums.get(i)));
                answer.add(i);
                return answer;
            } else if(target < 0 && map.containsKey(target + nums.get(i))) {
                answer.add(map.get(target - nums.get(i)));
                answer.add(i);
                return answer;
            }
            if(target > 0 && nums.get(i) <= target) {
                map.put(nums.get(i), i);
            } else if(target < 0 && nums.get(i) >= target) {
                map.put(nums.get(i), i);
            }
        }
        return List.of(0,0);
    }


    public List<Integer> perfectSolution(List<Integer> nums, int target) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            int difference = target - nums.get(i);
            if(map.containsKey(difference)) {
                result.add(map.get(difference));
                result.add(i);
                return result;
            }
            map.put(nums.get(i), i);
        }
        return result;
    }
}
