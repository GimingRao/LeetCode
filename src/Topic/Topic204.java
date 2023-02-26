package Topic;

public class Topic204 {
    public int countPrimes(int n) {
        //1. 新建整数res保存结果,新增数组p保存后续结果
        int res=0;
        int [] p=new int[n];
        //2. 从2开始注意分析，如果是质数保存res，同时将
        for (int i = 2; i <n ; i++) {
            if (p[i]==-1) continue;

            if (isPrimes(i)) {
                res++;
                for (int j = i; ((long) i *j) <n ; j++) {
                    p[i*j]=-1;
                }
            }
        }
        return res;
    }
    public boolean isPrimes(int n){
        //1. 判断从2-根号n是否出现能被n整除的
        for (int i=2;i*i<=n;i++){
            //2. 如果出现直接return flase
            if (n%i==0)
                return false;
        }
        //3. 判断完毕还是没有就return true；
        return true;
    }
}
