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

    //getter method of players name
    public String getName() {
        return name;
    }

    //method to add a card to players hand
    public void addCardToHand(Card card) {
        hand.insertLast(new node(card));
    }

    //method that removes a card from hand
    public void removeCardFromHand(Card card) {

    }

    //getter method for hand
    public LinkedList getHand() {
        return hand;
    }

    public String toString(){
        return getName()+"'s hand: "+getHand();
    }




}
