package src;

public class List {
    private Node first;
    private Node last;

    public void addLast(String countryName) {
        Node node = new Node(countryName);
        if (last == null && first == null) {
            last = node;
            first = node;
        } else {
            last.setNextElement(node);
            node.setPreElement(last);
            last = node;
        }
    }
 
    public void addFirst(String countryName) {
        Node node = new Node(countryName);
        if (last == null && first == null) {
            last = node;
            first = node;
        } else {
            node.setNextElement(first);
            first.setPreElement(node);
            first = node;
        }
    }
 
    public void printList() {
        for (Node i = first; i != null; i = i.getNextElement()) {
            System.out.printf("\n %s ", i.toString());
        }
        System.out.println();
    }
}

