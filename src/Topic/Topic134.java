package Topic;

public class Topic134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length=gas.length;
        int[] dif=new int[length];
        for (int i = 0; i <length ; i++) {
            dif[i]=gas[i]-cost[i];
        }
        for (int i = 0; i < length; ) {
            if (dif[i]<0){
                i++;
                continue;
            }
            int sum=0;
            int j=0;
            for (; j < length; j++) {
                int next=(i+j)%length;
                sum+=dif[next];
                if (sum<0)
                    break;
            }
            if (j==length)
                return i;
            i+=j;
        }
        return -1;
    }
}
