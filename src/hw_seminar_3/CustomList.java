package hw_seminar_3;

import java.util.Iterator;

public class CustomList<E> implements Iterable<Node> {
    private Node first;
    private Node last;

    public CustomList() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(E data) {
        Node tempo = new Node();
        tempo.setData(data);
        tempo.setNext(null);

        if (first == null) {
            tempo.setPrev(null);
            first = last = tempo;
        } else {
            tempo.setPrev(last);
            last.setNext(tempo);
            last = tempo;
        }
    }

    @Override
    public Iterator<Node> iterator() {
        return new LinkedList(first);
    }
}
