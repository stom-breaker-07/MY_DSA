package MY_DSA.Leet;

public class Leet79 {
    static boolean[][] cboard = new boolean[7][7];
    static boolean backtrack(char[][] board,int i,int j,String word,int idx ){
        if(idx == word.length()) return true;
        int backrow=i-1,frontrow=i+1;
        int backcol=j-1,frontcol=j+1;
        for(int k=backrow;k<=frontrow;k++){
            if(k>=0 && k<=board.length-1 && cboard[k][j]==false && board[k][j]==word.charAt(idx)){
                cboard[k][j]=true;
                if(backtrack(board,k,j,word,idx+1)) return true;
                cboard[k][j]=false;
            }
        }
        for(int k=backcol;k<=frontcol;k++){
            if(k>=0 && k<=board[0].length-1 && cboard[i][k]==false && board[i][k]==word.charAt(idx)){
                cboard[i][k]=true;
                if(backtrack(board,i,k,word,idx+1)) return true;
                cboard[i][k]=false;
            }
        }

        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                cboard[i][j]=false;
            }
        }

        //to find starting point
        char firstchar=word.charAt(0);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==firstchar){
                    cboard[i][j]=true;
                    if(backtrack(board,i,j,word,1)){
                        return true;
                    }
                    cboard[i][j]=false;
                }
            }
        }

        return false;
    }
}
