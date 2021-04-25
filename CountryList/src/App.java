package src;
import java.util.LinkedList; //get from java package LinkedList method 

public class App {
    public static void main(String[] args) throws Exception {
        List list = new List (); // instance a list of countries
        list.addFirst("Spain"); // add in the first position of the list
        list.addFirst("Andorra");
        list.addLast("Holland"); // add in the last position of the list
        list.addFirst("France");
        list.printList(); // print 
        list.countList(); // count list
        list.printCountry(); // print a country by position
        list.validateCountry(); // validate a country by name
        list.extractPosition(3); // extract a country by position
        list.extractCountry("Andorra"); // extract a country by name
        list.printList(); // print
        LinkedList <String> linkedList1 = new LinkedList <String>();
        linkedList1.addFirst("China");
        linkedList1.addLast("Japan");
        LinkedList <String> linkedList2 = new LinkedList <String>();
        linkedList2.addLast("Korea");
        linkedList2.addFirst("Taiwan");
        LinkedList <String> concatList = new LinkedList <String> ();
        concatList.addAll(linkedList1); // method of linkedList to concat 
        concatList.addAll(linkedList2);
        System.out.println("New linked list: " + concatList + "\n");
        concatList.set(2, "Mexico"); // method of linkedList to replace an element by position
        System.out.println("New linked list: " + concatList + "\n");
             }
}

