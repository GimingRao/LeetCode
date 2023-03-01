package Topic;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

public class Topic227 {
    public static int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int num=0;
        char sign='+';
        for (int i = 0; i < s.length(); i++) {
            char cur=s.charAt(i);
            if (Character.isDigit(cur))
                num=num*10+ (cur-'0');
            if (!Character.isDigit(cur)&&cur!=' '||i==s.length()-1){
                switch (sign){
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop()*num);
                        break;
                    case '/':
                        stack.push(stack.pop()/num);
                        break;
                }
                sign=cur;
                num=0;
            }
        }
        int ans=0;
        while (!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calculate("3+2*2"));
    }
}
