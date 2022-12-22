import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(l1.contains(nums[i])) continue;
            l1.add(nums[i]);
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]>0) r--;
                else if(nums[i]+nums[l]+nums[r]<0) l++;
                else {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(nums[l]==nums[l+1] && l+1<=nums.length-1) l++;
                    l++;
                }
            }

        }
        return list;
    }
    public static void main(String[] args){
        int[] arr=new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> list= threeSum(arr);
        System.out.println(list);

    }
}
