public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int num=28;
        System.out.println(Solution(num));
    }
    public static String Solution(int num){
        StringBuilder result=new StringBuilder();
        while(num!=0){
            num--;
            char c=(char) ('A'+num%26);
            result.append(c);
            num/=26;
        }
        result.reverse();
        return result.toString();
    }
}
