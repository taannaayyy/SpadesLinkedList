public class node {
    //attributes
    protected Card data;
    protected node next;

    //constructor
    node (Card data){
            this.data=data;
            this.next=null;
    }

    //setters

        public void setNext(node next){
            this.next = next;
    }

    //getters
    public node getNext(){
            return next;
    }

    public Card getData(){
            return data;
    }

    //toString method
    public String toString(){
            return "" + data;
    }

    //method to count the number of the nodes
    static int countNodes(node head){
            int count = 1;
            node current = head;
            while(current.next!=null){
                current=current.next;
                count++;
            }
            return count;
    }
}
