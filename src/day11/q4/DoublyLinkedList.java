package day11.q4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    //adds to the end of the list
    public void addLast(String item) {
        //implement
        Node newNode = new Node();
        newNode.value = item;

        Node currentNode = header;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        newNode.previous = currentNode;
        currentNode.next = newNode;
    }

    public boolean remove(String item) {
        //Implement
        Node currentNode = header.next;
        while (currentNode != null) {
            if (currentNode.value != null && currentNode.value.equals(item)) {
                Node previousNode = currentNode.previous;
                Node nextNode = currentNode.next;

                previousNode.next = nextNode;
                if (nextNode != null) {
                    nextNode.previous = previousNode;
                }

                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);

        System.out.println("Removing Harry: " + list.remove("Harry"));
        System.out.println(list);

        System.out.println("Removing John: " + list.remove("John"));
        System.out.println(list);
    }
}
