class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0 || nums == null){
            return result;
        }

        int start = nums[0];
        for(int i = 1; i <= nums.length; i++){
            if(i == nums.length || nums[i] != nums[i-1] + 1){
                if(start != nums[i-1]){
                    result.add(start + "->" + nums[i - 1]);
                } else{
                    result.add(String.valueOf(start));
                }

                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }
        return result;
    }
}