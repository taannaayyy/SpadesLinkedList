//this linked list is for players
public class LinkedList2 {

    //attributes
    protected node2 head;
    protected node2 tail;

    //constructor
    public LinkedList2() {
        head = null;
        tail = null;
    }

    //method to check if linked list is empty or not
    public boolean isEmpty(){
        return head == null;
    }

    //method to get the head node
    public node2 getHead(){
        return head;
    }

    //method to add a new node to the left
    public void insertFirst(node2 newNode) {
        if (tail == null) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
    }

    //method to add a new node to the right
    public void insertLast(node2 newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }
    // method to insert a new node between two nodes
    public void insertMiddle(node newNode, node previous) {
        newNode.setNext(previous.getNext());
        previous.setNext(newNode);
    }

    //searches a value if no node exists, returns null
    public node2 search(Player value) {
        node2 tmp = head;
        while (tmp != null) {
            if (value == tmp.getData()) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    //method that gets the node
    public node2 getNodeI(int i) {
        node2 tmp = head;
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
        node2 tmp = head;
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
    public node2 getPrevious(node2 node2){
        node2 tmp = head;
        node2 previous = null;
        while (tmp != node2) {
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
    public void deleteMiddle(node2 node2){
        node2 previous;
        previous = getPrevious(node2);
        previous.setNext(node2.getNext());
    }

    //toString method
    public String toString(){
        StringBuilder result = new StringBuilder();
        node2 tmp = head;
        while (tmp != null) {
            result.append(tmp).append(" ");
            tmp = tmp.getNext();
        }
        return result.toString();
    }


}
