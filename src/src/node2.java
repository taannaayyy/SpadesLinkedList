public class node2 {
    //attributes
    protected Player data;
    protected node2 next;

    //constructor
    node2 (Player data){
        this.data=data;
        this.next=null;
    }

    //setters
    public void setNext(node2 next){
        this.next = next;
    }

    //getters
    public node2 getNext(){
        return next;
    }

    public Player getData(){
        return data;
    }

    //toString method
    public String toString(){
        return "" + data;
    }

    //method for counting nodes
    static int countNodes(node2 head){
        int count = 1;
        node2 current = head;
        while(current.next!=null){
            current=current.next;
            count++;
        }
        return count;
    }
}
