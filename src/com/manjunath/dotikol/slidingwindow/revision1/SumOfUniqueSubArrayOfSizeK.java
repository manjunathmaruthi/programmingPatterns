package com.manjunath.dotikol.slidingwindow.revision1;

import java.util.HashMap;
import java.util.Map;

class SumOfUniqueSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] nums = {1,4,2};
        int k = 3;
        long maxSum = maximumSubarraySum(nums, k);
        System.out.println(maxSum);
    }
    public static long maximumSubarraySum(int[] nums, int k) {


        int i =0;
        int j=0;
        long maxSum = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (j < nums.length) {
            sum = sum + nums[j];
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            if (j-i+1 < k) {
                j++;
            } else if (j-i+1 == k) {
                if (map.size() == 3) {
                    maxSum = Math.max(sum, maxSum);
                }
                sum = sum - nums[i];
                map.put(nums[i], map.get(nums[i])-1);

                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
                j++;
            }
        }
        return maxSum;
        
    }
}