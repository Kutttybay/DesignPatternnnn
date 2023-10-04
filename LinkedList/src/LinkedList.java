public class LinkedList<T> {

    private Node<T> head;

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value){
            this.value = value;
        }
    }

    public void addFirst(T t){
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
    }
    public void addLast(T t){
        if (head == null){
            head = new Node<>(t);
            return;
        }

        Node<T> curr = head;
        while (curr != null){
            curr = curr.next;
        }
        curr.next = new Node<>(t);
    }
    public int get(T t){
        if (head == null){
            return -1;
        }
        if (head.value == t){
            return 0;
        }

        Node<T> curr = head;
        int res = 0;
        while (curr.next != null){
            ++res;
            if (curr.next.value == t){
                return res;
            }
            curr = curr.next;
        }

        return -1;
    }

    public void remove(T t){
        if (head == null){
            return;
        }
        if (head.value == t){
            head = head.next;
        }

        Node<T> curr = head;
        while (curr.next != null){
            if (curr.next.value == t){
                curr.next
            }
        }
    }
}
