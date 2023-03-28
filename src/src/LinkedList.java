//this link list holds the cards
public class LinkedList {

    //attributes
    protected node head;
    protected node tail;

    //constructor
    public LinkedList() {
        head = null;
        tail = null;
    }

    //method to check if linked list is empty or not
    public boolean isEmpty(){
        return head == null;
    }

    //method to get the head node
    public node getHead(){
        return head;
    }

    //method to add a new node to the right
    public void insertLast(node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    //searches a value if no node exists, returns null
    public node search(Card value) {
        node tmp = head;
        while (tmp != null) {
            if (value == tmp.getData()) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    //method that gets the node
    public node getNodeI(int i) {
        node tmp = head;
        int index = 0;
        while (tmp != null) {
            if (index == i){
                return tmp;
            }
            index++;
            tmp = tmp.getNext();
        }
        return null;
    }

    //method that returns the number of nodes in linked list
    public int numberOfElements(){
        node tmp = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    //method that delete the head of the linked list
    public void deleteFirst(){
        head = head.getNext();
        if (head == null){
            tail = null;
        }
    }

    //method to get the previous node
    public node getPrevious(node node){
        node tmp = head;
        node previous = null;
        while (tmp != node) {
            previous = tmp;
            tmp = tmp.getNext();
        }
        return previous;
    }

    //method to delete the last node
    public void deleteLast(){
        tail = getPrevious(tail);
        if (tail != null){
            tail.setNext(null);
        } else {
            head = null;
        }
    }

    //method to delete a node between two nodes
    public void deleteMiddle(node node){
        node previous;
        previous = getPrevious(node);
        previous.setNext(node.getNext());
    }

    //toString method
    public String toString(){
        StringBuilder result = new StringBuilder();
        node tmp = head;
        while (tmp != null) {
            result.append(tmp).append(" ");
            tmp = tmp.getNext();
        }
        return result.toString();
    }


}
