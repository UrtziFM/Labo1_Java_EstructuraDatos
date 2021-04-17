package src;

public class Node { // this is node to use as reference in the double list
    private String countryName; // country element
    private Node nextElement; // next element
    private Node preElement; // previous element

    public Node(String countryName){
        this.countryName = countryName;
    }
    public String getCountry(){ //this method get country name
        return countryName;
    }
    public void setCountry(String countryName){ //this method set a new country
        this.countryName = countryName;
    }
    public Node getNextElement(){  //this method get next element in the list
        return nextElement;
    }
    public void setNextElement(Node nextElement){ //this method set the next element in the list
        this.nextElement = nextElement;
    }
    public Node getPreElement(){ //this method get previous element in the list
        return preElement;
    }
    public void setPreElement(Node preElement){ //this method set the previous element in the list
        this.preElement = preElement;
    }

    @Override
    public String toString() {
        return "Node [value=" + countryName + ", nextElement=" + ((nextElement != null) ? nextElement.getCountry()
                : null) + ", preElement=" +( (preElement != null) ? preElement.getCountry() : null) + "]";
    }
}