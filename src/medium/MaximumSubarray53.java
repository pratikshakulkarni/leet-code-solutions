package src.medium;

/***
 @author: Pratiksha Kulkarni
 date: 10/7/2022
 */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            sum += i;
            max = Math.max(max, sum);
            sum = (sum < 0) ? 0 : sum;
        }
        return max;

    }
}
