package CodeCapriccio.array;

public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] ans=new  int[n][n];
        int begin=1;
        for (int base = 0; base <=(n-1) / 2; base++) {
            int len=n-base*2;
            begin= f(len, ans, base, begin);
        }
        return ans;
    }

    private static int f(int len, int[][] ans, int base, int begin) {
        int end=base+len-1;
        if (base==end){
            ans[base][base]=begin++;
            return begin;
        }
        for (int i = 0; i < len-1; i++) {
            ans[base][base+i]=begin;
            begin++;
        }
        for (int i = 0; i < len-1; i++) {
            ans[base+i][end]=begin;
            begin++;
        }
        for (int i = 0; i < len-1; i++) {
            ans[end][end-i]=begin;
            begin++;
        }
        for (int i = 0; i < len-1; i++) {
            ans[end-i][base]=begin;
            begin++;
        }
        return begin;
    }

    public static void main(String[] args) {
        generateMatrix(3);
    }
}
