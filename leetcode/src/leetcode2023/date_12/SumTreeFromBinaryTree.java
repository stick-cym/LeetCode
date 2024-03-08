package leetcode2023.date_12;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SumTreeFromBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode bstToGst(TreeNode root) {
        return null;
    }

    //深度优先,然后再累加
    public static TreeNode dfs() {
        return null;
    }

    public static TreeNode generate(TreeNode node, Integer[] root, int index) {
        if (root.length <= index) {
            return null;
        }
        node.val = root[index];
        node.left = generate(node.left, root, index + 1);
        return null;
    }

    public static void main(String[] args) throws Exception {

    }
}

