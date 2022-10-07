package src.medium;

/***
 @author: Pratiksha Kulkarni
 date: 10/7/2022
 */
public class FindTheDuplicateNumber287 {
    public int findDuplicate(int[] nums) {

        //initialize 2 pointers
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        //once slow and fast pointers are pointing to the same element, take fast pointer to the beginning
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
