package algorithms;

public class MainBinaryTree {
    public static void main(String[] args) {

        // Създаване на двоичното дърво

        BinaryTree<Integer> binaryTree =

                new BinaryTree<Integer>(14,

                        new BinaryTree<Integer>(19,

                                new BinaryTree<Integer>(23),

                                new BinaryTree<Integer>(6,

                                        new BinaryTree<Integer>(10),

                                        new BinaryTree<Integer>(21))),

                        new BinaryTree<Integer>(15,

                                new BinaryTree<Integer>(3),

                                null));

        // Обход и извеждане на дървото в префиксен ред.
        binaryTree.printPreOrder();
    }
}

