package src;

public class App {
    public static void main(String[] args) throws Exception {
        List list = new List();
        list.addFirst("Spain");
        list.addFirst("Andorra");
        list.addLast("Holland");
        list.addFirst("France");
        list.printList();
        list.countList();
        list.printCountry();
    }
}
