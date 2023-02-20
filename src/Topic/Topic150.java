package Topic;

public class Topic150 {
    public int evalRPN(String[] tokens) {
        int[] stacks=new int[tokens.length];
        int cur=-1;
        for (String token: tokens) {
            if ("+-*/".contains(token)){
                int left=stacks[cur--];
                int right=stacks[cur--];
                stacks[++cur]=ops(token,left,right);
            }else {
                stacks[++cur]=Integer.parseInt(token);
            }
        }
        return stacks[0];
    }
    public  int  ops(String  ops, int right , int left){
        if (ops.equals("+")) return left+right;
        if (ops.equals("-")) return left-right;
        if (ops.equals("*")) return left*right;
        if (ops.equals("/")) return left/right;
        return -1;
    }
}
