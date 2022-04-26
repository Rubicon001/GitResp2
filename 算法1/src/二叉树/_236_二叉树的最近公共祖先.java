package 二叉树;

//10  00:00:00
public class _236_二叉树的最近公共祖先 {
    /**
     * ① 两个节点都在root里 返回公共祖父节点
     * ② 两个节点都不在root里 返回null
     * ③ 只有p或q在root里 返回p或q本身
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
