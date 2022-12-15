//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//



import java.util.*;

public class TopKFrequent {
    public static void main(String[] args){
//        int[] arr=new int[]{1,1,1,1,2,2,3,3,3,3,3,3,3,4};
//        int[] arr=new int[]{13,13,13,5,5,10,10,10,10,11};
//                int[] arr=new int[]{1,1,1,2,2,3};


//        int[] arr=new int[]{-1,-1};
        int[] arr=new int[]{1,2};


        int k=2;

//        topKFrequent(arr,k);
        int[] temp=topKFrequent(arr,k);
        System.out.print("ans ");

        for(int i=0;i<k;i++)System.out.print(temp[i]+" ");
        System.out.println();
    }

    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==1) return nums;
        if(nums.length==2 && k==2) return nums;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        int[] a=new int[nums.length+1];
        ArrayList<Integer>[] list=new ArrayList[nums.length];
        for(int i=0;i<nums.length;i++) list[i]=new ArrayList<Integer>();
        int[] ans=new int[k];
        for(int j=0;j<nums.length;j++) for(int i:map.keySet()) list[map.get(i)].add(i);
        int index=0;
        int j=0;
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            if(list[i].size()>1) {
                for(int l=0;l<list[i].size();l++) {
                    ans[count++]=list[i].get(l++);
                    if(count==k) break;
                }
                if(count==k) break;
            }
            else j=0;
        }
        return ans;
    }


//    public static int[] topKFrequent(int[] nums, int k) {
//        int count=0;
//        int index=0;
//        int[] ans=new int[nums.length];
//        Map<Integer,Integer> map=new TreeMap<>();
//        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
//        Map sortedMap = valueSort(map);
//        Set set=sortedMap.keySet();
//        for(Object I : set) ans[index++]=(int)I;
//        int[] a=new int[k];
//        for(int i=0;i<k;i++) a[i]=ans[--index];
//        return a;
//    }
//
//    public static <K, V extends Comparable<V> > Map<K, V> valueSort(final Map<K, V> map)
//    {
//        Comparator<K> valueComparator = new Comparator<K>() {
//            public int compare(K k1, K k2)
//            {
//                int comp = map.get(k1).compareTo(map.get(k2));
//                if (comp == 0)	return 1;
//                else	return comp;
//            }
//        };
//        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
//        sorted.putAll(map);
//        return sorted;
//    }
}
