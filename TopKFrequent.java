//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//



import java.util.*;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        int count=0;
        int index=0;
        int[] ans=new int[nums.length];
        Map<Integer,Integer> map=new TreeMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        Map sortedMap = valueSort(map);
        Set set=sortedMap.keySet();
        for(Object I : set) ans[index++]=(int)I;
        int[] a=new int[k];
        for(int i=0;i<k;i++) a[i]=ans[--index];
        return a;
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,1,1,1,2,2,3,3,3,3,3,3,3};
        int k=2;
        int[] temp=topKFrequent(arr,k);
        for(int i=0;i<k;i++)System.out.print(temp[i]+" ");
    }
    public static <K, V extends Comparable<V> > Map<K, V> valueSort(final Map<K, V> map)
    {
        Comparator<K> valueComparator = new Comparator<K>() {
            public int compare(K k1, K k2)
            {
                int comp = map.get(k1).compareTo(map.get(k2));
                if (comp == 0)	return 1;
                else	return comp;
            }
        };
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        sorted.putAll(map);
        return sorted;
    }
}
