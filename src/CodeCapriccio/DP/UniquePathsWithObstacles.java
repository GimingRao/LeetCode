package CodeCapriccio.DP;

/**
 * TODO
 *
 * @author GimingRao
 * @data 2023/3/27 12:37
 */
public class UniquePathsWithObstacles {
    /**
     * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
     * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。
     * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
     * 网格中的障碍物和空位置分别用 1 和 0 来表示。
     *
     * @param obstacleGrid 障碍网格
     * @return int
     * dp[i][j]表示从i行j列出发到达终点的路径数目
     */
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        int[][] dp=new int[row][col];
        dp[row-1][col-1]=obstacleGrid[row-1][col-1] == 0 ? 1 : 0;
        for (int i = 1; i <row+col-1; i++) {
            for (int j = 0; j <= i ; j++) {
                int rowNow=row-1-j;
                int colNow=col-1-(i-j);
                if (rowNow<0||colNow<0||obstacleGrid[rowNow][colNow]==1)
                    continue;
                if (rowNow!=row-1)
                    dp[rowNow][colNow]+=dp[rowNow+1][colNow];
                if (colNow!=col-1)
                    dp[rowNow][colNow]+=dp[rowNow][colNow+1];
            }
        }
        return dp[0][0];
    }

}
