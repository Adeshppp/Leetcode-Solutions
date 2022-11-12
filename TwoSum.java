class TwoSum{
//    public static void main(String[] args) {
//        int[] nums = new int[]{2,7,11,15};
//        int target=9;
//        System.out.println(new int[]{Solution(nums,target)});
//    }
    public static int[] Solution(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j!=nums.length){
                if(nums[i]+nums[j]==target) return new int[]{i,j};
                if(nums[nums.length-1-i]-nums[nums.length-1-j]==target) return new int[]{nums.length-1-i,nums.length-j-1};
                j++;
            }
        }
        return null;
    }
}
