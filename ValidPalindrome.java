//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.


public class ValidPalindrome {
    public static void main(String[] args) {
        String str= "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        String a=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String rev= new StringBuilder(a).reverse().toString();
        return a.equals(rev);
    }
}
