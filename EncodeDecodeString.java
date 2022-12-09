//Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.
//        Please imblement encode and decode


import java.util.ArrayList;

public class EncodeDecodeString {
    public static void main(String[] args) {
        String[] arr=new String[]{"lint","code","love","you","!"};
        Decode(Encode(arr));
    }
    static char code='#';
    public static String Encode(String[] arr){
        StringBuilder str = new StringBuilder();
        for(String i:arr) str.append(i.length()).append(code).append(i);
        return str.toString();
    }
    public static void Decode(String str){
        ArrayList<String> list=new ArrayList<>();
        int count=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==code) {
                count = Character.getNumericValue(str.charAt(i - 1));
                continue;
            }
            list.add(str.substring(i,i+count));
            i+=count;
            }
        System.out.print(list);
        System.out.println();
        }
    }

