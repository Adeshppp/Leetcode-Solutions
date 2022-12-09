import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr=new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        int z=0;
        int c=0;
        for (int num : nums) {
            int count = 0;
            if (set.contains(num - 1)) continue;
            while (set.contains(num + z++)) count++;
            z = 0;
            if (count > c) c = count;
        }
        return c;
    }
}
