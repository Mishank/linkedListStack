public class linkedListStack<I> {

    private final LinkedList<I> linkedList = new LinkedList<>();

    public void push(I data) {
        linkedList.addFirst(data);
    }

    public I pop() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}

class LinkedList<I> {


    private static class Node<I> {


        private I data;

        private Node<I> next;

        public Node(I data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<I> first = null;


    public void addFirst(I data) {
        Node<I> newFirst = new Node<I>(data);
        newFirst.next = first;
        first = newFirst;
    }


    public I removeFirst() {
        Node<I> oldFirst = first;
        first = first.next;
        return oldFirst.data;
    }

    @Override
    public String toString() {
        StringBuilder listBuilder = new StringBuilder();
        Node currentNode = first;
        while (currentNode != null) {
            listBuilder.append(currentNode).append(",");
            currentNode = currentNode.next;
        }
        return listBuilder.toString();
    }

    public boolean isEmpty() {
        return first == null;
    }

}
