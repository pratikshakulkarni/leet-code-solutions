package src.medium;

import java.util.ArrayList;

/***
 @author: Pratiksha Kulkarni
 date: 9/14/2022
 */
public class maximumErasureValue1695 {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0,j=0;
        int maxSum=Integer.MIN_VALUE;
        int len=nums.length;
        int start=0;
        ArrayList<Integer> arr = new ArrayList<>();

        while (j<len && start<len){
            if(!arr.contains(nums[j])){
                arr.add(nums[j]);
                //j++;
            }else {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[start];
                arr.remove(start);
                start++;
            }
            if(nums[start]==nums[j]){
                sum-=nums[start];
                arr.remove(start);
                start++;
            }
            sum+=nums[j];
            j++;
        }
        maxSum = Math.max(maxSum, sum);
        return maxSum;
    }

    public static void main(String[] args) {
        maximumErasureValue1695 m = new maximumErasureValue1695();
        System.out.println("Result = "+m.maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));
    }
}
