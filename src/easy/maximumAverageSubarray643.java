package src.easy;

/***
 @author: Pratiksha Kulkarni
 date: 9/14/2022
 */
public class maximumAverageSubarray643 {
     public static double findMaxAverage(int[] nums, int k) {

        int i, j, end;
        // Double.MIN_VALUE;
        double currentAvg = 0.0;
        int len = nums.length;

        for (j = 0; j < k; j++) {
            currentAvg += nums[j];
        }
        //currentAvg = currentAvg / k;
        double maxAvg = currentAvg/k;

        for (end = k; end < len; end++) {
           currentAvg-=nums[end-k];
           currentAvg+=nums[end];
           maxAvg=Math.max(maxAvg,currentAvg/k);
        }

        return maxAvg;
    }

    public static void main(String[] args) {
        System.out.println("Result - " + findMaxAverage(new int[]{-1}, 1));
    }
}
