public class CircularLinkedList<T> {
    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }

    public void addToLast(T data){
        Node newNode = new Node(data, null);
        if (isEmpty()){
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        last.next = first;
    }

    public void removeFromFirst() {
        if(!isEmpty()) {
            first = first.next;
            if (isEmpty()) {
                last = null;
            } else {
                last.next = first;
            }
        }
    }


    public boolean isEmpty() {
        return (first == null);
    }

    public class Node {
        private T data;
        private Node next;

        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void displayList(){
        if(isEmpty()){
            System.out.println("Ախպեր մեջը բան չկա");
            return;
        }

        CircularLinkedList.Node current = first;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        }while (current != first);

        System.out.println();
    }
}