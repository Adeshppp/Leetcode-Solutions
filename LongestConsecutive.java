import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr=new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1 || (nums.length==2 && nums[0]==nums[1])) return 1;
        Arrays.sort(nums);
        ArrayList<Integer>[] al=new ArrayList[nums.length];
        for(int i=0;i<nums.length;i++) al[i]=new ArrayList<Integer>();

        int k=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) {
                if(i+1==nums.length-1) al[k].add(nums[i]);
                continue;}
            if((nums[i]+1)==(nums[i+1])){
                al[k].add(nums[i]);
                if((i+1)==nums.length-1) al[k].add(nums[i+1]);
            }
            else{
                al[k].add(nums[i]);
                k++;
            }
        }
        int max=-1000;
        for (ArrayList<Integer> integers : al) if (integers.size() > max) max = integers.size();
        return max;
    }
}
