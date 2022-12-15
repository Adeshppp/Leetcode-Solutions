import java.util.Arrays;
import java.util.HashMap;

class TwoSum{
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target=9;

        System.out.println(Arrays.toString(Solution(nums, target)));
    }
//    public static int[] Solution(int[] nums,int target){
//        for(int i=0;i<nums.length;i++){
//            int j=i+1;
//            while(j!=nums.length){
//                if(nums[i]+nums[j]==target) return new int[]{i,j};
//                if(nums[nums.length-1-i]-nums[nums.length-1-j]==target) return new int[]{nums.length-1-i,nums.length-j-1};
//                j++;
//            }
//        }
//        return null;
//    }
    public static int[] Solution(int[] nums, int target){

        HashMap<Integer, Integer> map=new HashMap<>();
        int i=0;
        for(i=0;i<nums.length;i++){
            if(map.containsValue(target-nums[i])) break;
            else map.put(i,nums[i]);
        }
        System.out.println("map "+ map);
        for(int key: map.keySet()){
            if(map.get(key)==target-nums[i]) return new int[]{key,i};
        }
        return new int[]{};
    }
}
