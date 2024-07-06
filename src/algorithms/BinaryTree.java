package algorithms;

//Програма, която намира броя на срещанията на дадено число в дадено дърво от числа.

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {

    // Метод за броене на срещанията на дадено число
    public int countOccurrences(TreeNode root, int target) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        if (root.value == target) {
            count++;
        }

        count += countOccurrences(root.left, target);
        count += countOccurrences(root.right, target);

        return count;
    }

    public static void main(String[] args) {
        // Примерно дърво
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        BinaryTree tree = new BinaryTree();

        // Търсене на броя на срещанията на числото 2
        int target = 2;
        System.out.println("Броят на срещанията на числото " + target + " е: " + tree.countOccurrences(root, target));
    }
}
