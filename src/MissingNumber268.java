package src;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {

        int i;
        Set<Integer> set = new HashSet();


        for(int j: nums)
            set.add(j);

        for(i=0;i<=nums.length;i++){
            if(!set.contains(i))
                return i;
        }

        return i;
    }
}
