package algorithms;
// програма, която извежда корените на онези поддървета на дадено дърво,
// които имат точно k на брой върха, където k e дадено естествено число.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubtreeFinder {

    static class TreeNode {
        int val;
        List<TreeNode> children;

        TreeNode(int val) {
            this.val = val;
            children = new ArrayList<>();
        }
    }

    private static Map<TreeNode, Integer> subtreeSizes = new HashMap<>();

    public static void main(String[] args) {
        // Примерно дърво
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        node3.children.add(node6);
        node3.children.add(node7);

        int k = 3;  // зададено число k
        List<TreeNode> result = findSubtreesWithKNodes(root, k);

        System.out.println("Корените на поддърветата с " + k + " върха са:");
        for (TreeNode node : result) {
            System.out.println(node.val);
        }
    }

    private static List<TreeNode> findSubtreesWithKNodes(TreeNode root, int k) {
        List<TreeNode> result = new ArrayList<>();
        calculateSubtreeSizes(root);
        for (Map.Entry<TreeNode, Integer> entry : subtreeSizes.entrySet()) {
            if (entry.getValue() == k) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    private static int calculateSubtreeSizes(TreeNode node) {
        if (node == null) return 0;
        int size = 1; // включваме текущия възел
        for (TreeNode child : node.children) {
            size += calculateSubtreeSizes(child);
        }
        subtreeSizes.put(node, size);
        return size;
    }
}