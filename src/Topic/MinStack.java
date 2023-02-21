package Topic;

import java.util.Stack;

public class MinStack {
    Stack<Integer> mainStack;//存放主值的栈
    Stack<Integer> minStack;//存放最小值的栈
    public MinStack() {
        mainStack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int val) {
        //1.若目前栈空直接添加
        if (mainStack.isEmpty()){
            mainStack.push(val);
            minStack.push(val);
            return;
        }
        //2. 若栈不空先判断加入值比当前值最小值的大小
        int min=minStack.peek();
        if (min<=val){
            //3、若新加入值比当前最小值小则汪minStack压入新加入值，mainstack压入当前值
            minStack.push(min);
            mainStack.push(val);
        }//4.反之两个栈均压入当前值
        else {
            minStack.push(val);
            mainStack.push(val);
        }

    }

    public void pop() {
        minStack.pop();
        mainStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
