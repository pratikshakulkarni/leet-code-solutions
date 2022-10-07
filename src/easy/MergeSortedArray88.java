package src.easy;

/***
 @author: Pratiksha Kulkarni
 date: 10/7/2022
 */
public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = nums1.length;
        int y = nums2.length;

        if (x > 0 && y > 0)
            for (int i = 0; i < m; i++) {
                if (nums1[i] > nums2[0]) {
                    int temp = nums1[i];
                    nums1[i] = nums2[0];
                    nums2[0] = temp;
                }

                int first = nums2[0];
                int k;
                for (k = 1; k < n && nums2[k] < first; k++) {
                    nums2[k - 1] = nums2[k];
                }
                nums2[k - 1] = first;
            }
        int j = 0;
        while (m < x) {
            nums1[m++] = nums2[j++];
        }

    }
}
