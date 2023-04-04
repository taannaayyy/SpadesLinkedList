//this class is for the players
public class Player {
    //attributes
    //name is for the name of the player
    //hand is a linked list of the players cards
    //score is for the players score
    private String name;
    private LinkedList hand;
    private int score;
    private int numofTricks;
    private int bid;

    //constructor
    public Player(String name){
        hand= new LinkedList();
        this.name=name;
        score=0;
        numofTricks=0;
    }

    //getter methods
    public String getName() {
        return name;
    }

    public LinkedList getHand() {
        return hand;
    }

    public int getScore(){
        return score;
    }

    //setters
    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setNumofTricks(int numofTricks) {
        this.numofTricks = numofTricks;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setHand(LinkedList hand) {
        this.hand = hand;
    }

    public int getBid() {
        return bid;
    }

    public int getNumofTricks() {
        return numofTricks;
    }

    //method to add a card to players hand
    public void addCardToHand(Card card) {
        hand.insertLast(new node(card));
    }

    //method that removes a card from hand
    public void removeCardFromHand(Card card) {

    }

    //toString method for printing
    public String toString(){
        return getName()+"'s hand: "+getHand();
    }

}
