package src;

import javax.swing.JOptionPane;

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

    int size = 0;

    public void printList(){
        for (Node i = first; i != null; i = i.getNextElement()) {
            System.out.printf("\n %s ", i.showList());
            size++;
        }
        System.out.println("\n");
    }
    public void countList(){
        System.out.printf(" Size of the list is: %d \n", size);
    }
    public void printCountry(){
        String texto =JOptionPane.showInputDialog("What position of the list do you want to print?");
        int n = Integer.parseInt(texto); //text to integer
    
    }
}

