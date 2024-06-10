package collections;

//  създаване на клас за възлите и за самия списък.
public class Node <T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
