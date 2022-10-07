package src.medium;

/***
 @author: Pratiksha Kulkarni
 date: 10/7/2022
 */
public class SortColors75 {
    public void sortColors(int[] nums) {
        /***Dutch national flag algorithm:
         * 3 pointers - low, mid, high
         * [0-low-1] are 0s
         * [high+1-n] are 2s
         * [low-mid-1] are 1s
         */

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(mid, high, nums);
                high--;
            } else {
                //nums[mid]==1
                mid++;
            }
        }
    }

    private void swap(int l, int m, int[] nums) {
        int temp = nums[l];
        nums[l] = nums[m];
        nums[m] = temp;
    }
}
