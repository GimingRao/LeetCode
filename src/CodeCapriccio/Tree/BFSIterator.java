package CodeCapriccio.Tree;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历
 *
 * @author GimingRao
 * @data 2023/3/22 19:23
 */
public class BFSIterator {

    /**
     * 计数法层序遍历
     *
     * @param root 根
     * @return
     * 1. 头节点入队列
     * 2. while循环队列为空
     * 3. 0-i(计数器)弹出队列，若存在左右节点分别入队列，计数器+1
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
            return new ArrayList<>();
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();
        int countNext=1;
        int countCur=1;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ansCur=new ArrayList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()){
            countCur=countNext;
            countNext=0;
            ansCur=new ArrayList<>();
            for (int i = 0; i <countCur ; i++) {
                TreeNode cur=treeNodeQueue.poll();
                ansCur.add(cur.val);
                if(cur.left!=null){
                    treeNodeQueue.add(cur.left);
                    countNext++;
                }
                if(cur.right!=null){
                    treeNodeQueue.add(cur.right);
                    countNext++;
                }
            }
            ans.add(ansCur);
        }
        return ans;
    }
}
