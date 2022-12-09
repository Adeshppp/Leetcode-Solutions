import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr=new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        ArrayList<Integer>[] al=new ArrayList[nums.length]; //declaring arraylist in arraylist type array
        for(int i=0;i<nums.length;i++) al[i]=new ArrayList<Integer>();
        int index=0;
        for (int num : nums) {
            if (set.contains(num - 1) || set.contains(num + 1)) {
                if (set.contains(num - 1)) al[index].add(num - 1);
                if (set.contains(num + 1)) al[index].add(num + 1);
                al[index].add(num);
            } else index++;
        }
        set.clear();
        //removing duplicates
        for(ArrayList<Integer> list:al){
            set= new HashSet<>(list);
            list.clear();
            list.addAll(set);
        }
        int size=0;
        for(ArrayList<Integer> list:al) if(size<list.size()) size=list.size();
        return size;
    }
}
