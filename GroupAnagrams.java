class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        Map<String, ArrayList<String>> map=new HashMap<>();
        for(String str: strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String s=String.valueOf(c);
            if(!map.containsKey(s)) map.put(s,new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());

    }
}
