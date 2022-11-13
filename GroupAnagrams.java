import java.util.ArrayList;
import java.util.List;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams=new ArrayList<List<String>>();
        for(int i=0;i<strs.length;i++){
            if(strs[i]==null) continue;
            List<String> anagramsGroup=new ArrayList<String>();
            anagramsGroup.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(strs[j]==null) continue;
                if(isAnagram(strs[i],strs[j])){
                    anagramsGroup.add(strs[j]);
                    strs[j]=null;
                }
            }
            anagrams.add(anagramsGroup);
        }
        return anagrams;

    }
    public  boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] a=new int[26];
        for(int i=0;i<s.length();i++) a[s.charAt(i) - 'a']++;
        for(int i=0;i<t.length();i++) a[t.charAt(i) - 'a']--;
        for(int i:a) if (i!=0) return false;
        return true;
    }
}
