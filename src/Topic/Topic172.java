package Topic;

public class Topic172 {
    public int trailingZeroes(int n) {
        int res=0;
        while (n>=5){
            n/=5;
            res+=n;
        }
        return res;
    }
}
