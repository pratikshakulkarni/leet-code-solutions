class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Set<Integer> hash = new HashSet();
        int i;
        
        for(int j : nums){
            hash.add(j);
        }
        
        
        for(i=1;i<=nums.length;i++){
            if(!(hash.contains(i)))
                return i;
        }
        
        return i;
    }
}