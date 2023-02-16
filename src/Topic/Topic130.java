package Topic;

import java.util.HashSet;
import java.util.Set;

public class Topic130 {
    //dfs解法
    public void solve_dfs(char[][] board) {
        //存已标记单元格式为x_y；
        Set<String> beSurround=new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            f(i,0,board,beSurround);
            f(i,board[0].length-1,board,beSurround);
        }
        for (int i = 0; i < board[0].length; i++) {
            f(0,i,board,beSurround);
            f(board.length-1,i,board,beSurround);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                String coridinate=i+"_"+j;
                if (board[i][j]=='O'&&!beSurround.contains(coridinate))
                    board[i][j]='X';
            }
        }
    }
    //递归将x,y前后左右未标记的单元标记
    public void f(int x,int y,char[][] board,Set<String> hash){
        String coridinate=x+"_"+y;
        if (board[x][y]=='X'||hash.contains(coridinate))
            return;
        hash.add(coridinate);
        if (x!=0)
            f(x-1,y,board,hash);
        if (y!=0)
            f(x,y-1,board,hash);
        if(x!=board.length-1)
            f(x+1,y,board,hash);
        if (y!=board[0].length-1)
            f(x,y+1,board,hash);
    }
}
