class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0;
        int maxValue = Integer.MIN_VALUE;

        while(left < right){
            if(height[left] <= height[right]){
                area = height[left]*(right-left);
                left++;
            } else if(height[left] > height[right]){
                area = height[right]*(right-left);
                right--;
            }
            if(area > maxValue){
                maxValue = area;
            }
        }
        return maxValue;
    }
}