package Topic;

public class Topic289 {
    public static void gameOfLife(int[][] board) {
        int row=board.length;
        int col=board[0].length;
        int[] offset={-1,0,1};
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int count=0;
                for (int offsetRowIndex = 0; offsetRowIndex < 3; offsetRowIndex++) {
                    for (int offestColIndex = 0; offestColIndex < 3; offestColIndex++) {
                        if(!(offset[offsetRowIndex]==0&&offset[offestColIndex]==0)){
                            int rowOff=i+offset[offsetRowIndex];
                            int colOff=j+offset[offestColIndex];
                            if (rowOff>=0&&rowOff<row&&colOff>=0&&colOff<col&&Math.abs(board[rowOff][colOff])==1)
                                count++;
                        }
                    }
                }
                if (board[i][j]==1&&!(count==2||count==3))
                    board[i][j]=-1;
                if (board[i][j]==0&&count==3)
                    board[i][j]=2;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j]>0)
                    board[i][j]=1;
                else board[i][j]=0;
            }
        }
    }

    public static void main(String[] args) {
        gameOfLife(new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}});
    }
}
