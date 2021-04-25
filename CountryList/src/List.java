package src;

import javax.swing.JOptionPane;

public class List {
    private Node first; // create at Node first element variable
    private Node last; // create at Node last element variable
    int size = 0; // variable for set list size
    int position = 0; // variable for set element position
    int n; // variable for iterator

    public void addLast(String countryName) { // method to add in last position an element
        Node node = new Node(countryName);
        if (last == null && first == null) { // in case is empty list
            last = node;
            first = node;
        } else {
            last.setNextElement(node);
            node.setPreElement(last);
            last = node;
        }
    }
 
    public void addFirst(String countryName) { // method to add in last position an element
        Node node = new Node(countryName);
        if (last == null && first == null) { // in case is empty list
            last = node;
            first = node;
        } else {
            node.setNextElement(first);
            first.setPreElement(node);
            first = node;
        }
    }

    public void printList(){ //method to iterate in the list and print it
        for (Node i = first; i != null; i = i.getNextElement()) {
            System.out.printf("\n %s ", i.showList());
            size++; //count size
        }
        System.out.println("\n");
    }

    public void countList(){
        System.out.printf(" Size of the list is: %d \n", size); // print size
    }

    public void printCountry(){ //method to print country in required position
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

    public void validateCountry(){ // method to validate if a country is on the list
        String texto =JOptionPane.showInputDialog("What country do you want to validate?");
        for (Node i = first; i != null; i = i.getNextElement()) {
            String countryName = i.showList();
            if(countryName.equals(texto)){
                System.out.printf("This country is on the list \n");
            }
        }
        System.out.println();
    }

    public Object extractPosition(int n) { //method to extract a country by position
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

    public Object extractCountry(String countryName) { //method to extract a country by name
        Object out = null;
        for (Node i = first; i != null; i = i.getNextElement()) {
            String country = i.showList();
            if(country.equals(countryName)){
                Node n = i.getPreElement(); // get the previous country to set the new list
                n.setNextElement(n.getNextElement().getNextElement());
            }
        }
        return out;
    }
}

