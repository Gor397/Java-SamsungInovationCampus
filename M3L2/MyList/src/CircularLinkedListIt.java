import java.util.Iterator;

public class CircularLinkedListIt<T> implements Iterable<T>{
    private class Node {
        private T data;
        private Node next;

        Node (T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node first;
    private Node last;

    public CircularLinkedListIt() {
        first = null;
        last = null;
    }

    public void addToLast(T data) {
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        last.next = first;
    }

    public void removeFromFirst() {
        if (isEmpty()) { return; }

        first = first.next;
        if (isEmpty()) {
            last = null;
        } else {
            last.next = first;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("The list is empty!");
            return;
        }

        Node current = first;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != first);
        System.out.println();
    }
    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        private Node cursor = first;
        private  boolean firstIteration = true;

        @Override
        public boolean hasNext() {
            return cursor != null && (cursor != first || firstIteration);
        }

        @Override
        public T next() {
            T item = cursor.data;
            cursor = cursor.next;
            if (cursor == first) {
                firstIteration = false;
            }
            return item;
        }
    }
}