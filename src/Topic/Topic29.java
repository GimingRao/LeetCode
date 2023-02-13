package Topic;

public class Topic29 {
    //MIN_VALUE的绝对值比MAX_VALUE大，直接全部变为复数处理。
    public int divide(int dividend, int divisor) {
        if (dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
        boolean flag=false;
        if (dividend>0){
            dividend=-dividend;
            flag=!flag;
        }
        if (divisor>0){
            divisor=-divisor;
            flag=!flag;
        }
        int res=0;
        int divisorBase=divisor;
        while (divisor>=dividend){
            int cur=1;
            while (divisor>=-1073741824&&divisor<<1>=dividend){//若divisor超出MIN_VALUE的一半，左移之后就会超出正常值。
                divisor=divisor<<1;
                cur=cur<<1;
            }
            dividend-=divisor;
            res +=cur;
            divisor=divisorBase;
        }
        return flag?-res:res;
    }
}
