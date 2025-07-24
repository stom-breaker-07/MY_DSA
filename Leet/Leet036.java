package MY_DSA.Leet;

import java.util.HashSet;
import java.util.Set;

public class Leet036 {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character> rowSet=new HashSet<>();
            Set<Character> colSet=new HashSet<>();
            Set<Character> matSet=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(!rowSet.add(board[j][i])) return false;
                }
                if(board[i][j]!='.'){
                    if(!colSet.add(board[i][j])) return false;
                }
                int r = 3*(i/3)+j/3;
                int c = 3*(i%3)+j%3;
                if (board[r][c]!='.') {
                    if (!matSet.add(board[r][c])) return false;
                }
            }
        }
        return true;
    }
}
