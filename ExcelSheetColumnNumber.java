public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String str="ZY";
        System.out.println(Solution(str));
    }
    public static int Solution(String str){
        int result=0;
        for(int i=0;i<str.length();i++) result=result*26+str.charAt(i)-'A'+1;
        return result;
    }
}
