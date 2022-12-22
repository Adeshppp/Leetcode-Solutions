class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int area=0;
        while(l<r){
            if(height[l]<height[r]) {
                if(area<height[l]*(r-l)) area=height[l]*(r-l);
                l++;
            }
            else if(height[l]>=height[r]){
                if(area<height[r]*(r-l)) area=height[r]*(r-l);
                r--;
            }
        }
        return area;
    }
}
