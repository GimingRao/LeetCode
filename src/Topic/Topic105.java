package Topic;

import DataStructure.TreeNode;

import java.util.Arrays;

public class Topic105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==1)
            return new TreeNode(preorder[0]);
        int rootValue=preorder[0];
        TreeNode root=new TreeNode(rootValue);
        int leftLength=0;
        while (leftLength<inorder.length){
            if (inorder[leftLength]==rootValue)
                break;
            leftLength++;
        }
        if (leftLength!=0) {
            int[] leftPreorder = Arrays.copyOfRange(preorder, 1, leftLength+1);
            int[] leftInorder = Arrays.copyOfRange(inorder, 0, leftLength );
            root.left=buildTree(leftPreorder,leftInorder);
        }
        if (leftLength!=inorder.length-1) {
            int[] rightPreorder = Arrays.copyOfRange(preorder, leftLength + 1, preorder.length );
            int[] rightInorder = Arrays.copyOfRange(inorder, leftLength + 1, preorder.length );
            root.right=buildTree(rightPreorder,rightInorder);
        }
        return root;
    }
}
