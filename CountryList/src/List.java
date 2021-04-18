package src;

import javax.swing.JOptionPane;

public class List {
    private Node first;
    private Node last;
    int size = 0;
    int position = 0;
    int n;

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
        for (Node i = first; i != null; i = i.getNextElement()) {
            position++;
            if(position == n){
                System.out.printf("\n %s ", i.showList());
            }
        }
        System.out.println("\n");
    }
    public void validateCountry(){
        String texto =JOptionPane.showInputDialog("What country do you want to validate?");
        for (Node i = first; i != null; i = i.getNextElement()) {
            String countryName = i.showList();
            if(countryName.equals(texto)){
                System.out.printf("This country is on the list \n");
            }
        }
        System.out.println();
    }
    public Object extractPosition(int n) {
        Object out = null;
        Node iterator = first;

        for (int i = 1; i < n; i++) {
            if (iterator.getNextElement().getNextElement() == null)
                break; //we stop is we reach the end of the list
                iterator = iterator.getNextElement();
            }
            out = iterator.getNextElement().getCountry();
            iterator.setNextElement(iterator.getNextElement().getNextElement());
        return out;
    }
    public Object extractCountry(String countryName) {
        Object out = null;
        for (Node i = first; i != null; i = i.getNextElement()) {
            String country = i.showList();
            if(country.equals(countryName)){
                i.setNextElement(i.getNextElement().getNextElement());
            }
        }
        return out;
    }
}

