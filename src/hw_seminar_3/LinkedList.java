package hw_seminar_3;

import java.util.Iterator;

public class LinkedList<E> implements Iterator<Node> {
    private Node current;

    public LinkedList(Node first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        Node tempo = current;
        current = current.getNext();
        return tempo;
    }
}
