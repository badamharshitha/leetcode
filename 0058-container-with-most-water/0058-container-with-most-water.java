class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int max=0;
      int area=0;
       while(left!=right){
        int width=right-left;
        int min=height[left];
        if(height[right]<min)min=height[right];
        area=width*min;
        if(max<area)max=area;
        if(height[left]<height[right])left++;
        else right--;
       }
       return max;
    }
}