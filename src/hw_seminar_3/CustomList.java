package hw_seminar_3;

import java.util.Iterator;

public class CustomList<E> implements Iterable<Node> {
    private Node first;
    private Node last;

    public CustomList() {
        first = last = null;
    }


    public void add(E elem) {
        Node temp = new Node();
        temp.setData(elem);
        temp.setNext(null);

        if (first == null) {
            temp.setPrev(null);
            first = last = temp;
        } else {
            temp.setPrev(last);
            last.setNext(temp);
            last = temp;
        }
    }

    @Override
    public Iterator<Node> iterator() {
        return new LinkedList(first);
    }
}
