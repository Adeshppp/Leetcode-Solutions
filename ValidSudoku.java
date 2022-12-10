import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board=new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=0;j<9;j++){
                int ch=board[i][j]-'0';
                if(ch<0) ch=0;
                if(ch!=0){
                    if(set.contains(ch) && ch>0) return false;
                    else set.add(ch);}
            }
            set.clear();
            for(int j=0;j<9;j++){
                int ch=board[j][i]-'0';
                if(ch<0) ch=0;
                if(ch!=0){
                    if(set.contains(ch) && ch>0) return false;
                    else set.add(ch);}
            }
        }
        for(int i=0;i<7;i+=3){
            Set<Integer> set=new HashSet<>();
            int j=0;
            for(j=i;j<i+3;j++){
                for(int k=0;k<3;k++) {
                    int ch=board[j][k]-'0';
                    if(ch<0) ch=0;
                    if(set.contains(ch) && ch>0) return false;
                    else set.add(ch);
                }
            }
            set.clear();
            for(j=i;j<i+3;j++){
                for(int k=3;k<6;k++) {
                    int ch=board[j][k]-'0';
                    if(ch<0) ch=0;
                    if(set.contains(ch) && ch>0) return false;
                    else set.add(ch);

                }
            }
            set.clear();
            for(j=i;j<i+3;j++){
                for(int k=6;k<9;k++) {
                    int ch=board[j][k]-'0';
                    if(ch<0) ch=0;
                    if(set.contains(ch) && ch>0) return false;
                    else set.add(ch);
                }
            }
        }
        return true;
    }
}
