package Topic;

import java.util.ArrayList;
import java.util.List;

/*
数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。

示例 1：
输入：n = 3
输出：["((()))","(()())","(())()","()(())","()()()"]
示例 2：
输入：n = 1
输出：["()"]
 */
public class Topic22 {
    public List<String> generateParenthesis(int n) {
        List<String > res=new ArrayList<>();
        DFS(n,0,0,new StringBuilder(),res);
        return  res;
    }
    public  void DFS(int n,int n_left,int n_right,StringBuilder tmp,List<String> res){
        if (n==n_left&&n==n_right){
            res.add(tmp.toString());
            return;
        }
        //若左括号比右括号多，添加右括号
        if (n_left>n_right){
            tmp.append(')');
            DFS(n,n_left,n_right+1,tmp,res);
            tmp.deleteCharAt(tmp.length()-1);
        }
        //若左括号没到n，添加左括号
        if (n_left<n){
            tmp.append('(');
            DFS(n,n_left+1,n_right,tmp,res);
            tmp.deleteCharAt(tmp.length()-1);
        }
    }
}
