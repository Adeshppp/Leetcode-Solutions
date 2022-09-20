import java.util.*;

class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Z a = new Z();
        System.out.println(a.lengthOfLastWord(s));
    }
}
class Z{
    public int lengthOfLastWord(String s){
        int len=s.length();
        int count=0;
        for (int i = len-1; i >=0; i--) {
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
            if(count!=0 && s.charAt(i)==' '){
                break;
            }

        }
        return count;
    }
}



