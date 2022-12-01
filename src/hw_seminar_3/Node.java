package hw_seminar_3;

public class Node<E> {
    private Node next;
    private Node prev;
    private E elem;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public E getData() {
        return elem;
    }

    public void setData(E data) {
        this.elem = data;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
