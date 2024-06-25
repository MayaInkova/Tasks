package algorithms;
//реализация на двоично дърво , където всеки възел може да има до две деца.
// Класът е предназначен да работи с произволен тип данни, посочен от параметъра T.
public class BinaryTree<T> {


    public static class BinaryTreeNode<T> {

        private T value;
        private boolean hasParent;
        private BinaryTreeNode<T> leftChild;
        private BinaryTreeNode<T> rightChild;

        public BinaryTreeNode(T value,

                              BinaryTreeNode<T> leftChild,

                              BinaryTreeNode<T> rightChild) {

            if (value == null) {

                throw new IllegalArgumentException("Cannot insert null value!");

            }

            this.value = value;

            this.leftChild = leftChild;

            this.rightChild = rightChild;

        }

        // Конструктор за възел без деца
        public BinaryTreeNode(T value) {
            this(value, null, null);

        }

        // Връща стойността на възела
        public T getValue() {

            return this.value;

        }

        // Задава стойността на възела
        public void setValue(T value) {

            this.value = value;

        }

        // Връща лявото дете на възела
        public BinaryTreeNode<T> getLeftChild() {

            return this.leftChild;

        }

        // Задава лявото дете на възела
        public void setLeftChild(BinaryTreeNode<T> value) {

            if (value == null || value.hasParent) {

                throw new IllegalArgumentException();

            }


            value.hasParent = true;

            this.leftChild = value;

        }

        // Връща дясното дете на възела
        public BinaryTreeNode<T> getRightChild() {

            return this.rightChild;

        }

        // Задава дясното дете на възела
        public void setRightChild(BinaryTreeNode<T> value) {

            if (value == null || value.hasParent) {

                throw new IllegalArgumentException();

            }


            value.hasParent = true;

            this.rightChild = value;

        }

    }

    // Коренът на дървото
    private BinaryTreeNode<T> root;

    // Конструктор за дърво с коренна стойност и поддървета
    public BinaryTree(T value, BinaryTree<T> leftChild,

                      BinaryTree<T> rightChild) {

        if (value == null) {

            throw new IllegalArgumentException();

        }


        BinaryTreeNode<T> leftChildNode =

                leftChild != null ? leftChild.root : null;

        BinaryTreeNode<T> rightChildNode =

                rightChild != null ? rightChild.root : null;

        this.root = new BinaryTreeNode<T>(

                value, leftChildNode, rightChildNode);

    }

    // Конструктор за дърво само с коренна стойност
    public BinaryTree(T value) {

        this(value, null, null);

    }

    // Връща корена на дървото
    public BinaryTreeNode<T> getRoot() {

        return this.root;

    }

    // Връща лявото дете на корена
    public BinaryTreeNode<T> getLeftChildNode() {

        if (this.root != null) {

            return this.root.getLeftChild();

        }

        return null;

    }

    // Връща дясното дете на корена
    public BinaryTreeNode<T> getRightChildNode() {

        if (this.root != null) {

            return this.root.getRightChild();

        }

        return null;

    }

    // Префиксен обход на дървото (private метод)

    private void printPreOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }
        // Първо посетете текущия възел
        System.out.print(root.getValue() + " ");
        // След това обиколете лявото дете
        printPreOrder(root.getLeftChild());
        // Накрая обиколете дясното дете
        printPreOrder(root.getRightChild());
    }

    public void printPreOrder() {
        printPreOrder(this.root);
        System.out.println();
    }
}
