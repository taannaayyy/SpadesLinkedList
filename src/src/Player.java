public class Player {
    //attributes
    private String name;
    private LinkedList hand;
    private int score;

    //constructor
    public Player(String name){
        hand= new LinkedList();
        this.name=name;
        score=0;
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
        //hand.remove(card);
    }

    //getter method for hand
    public LinkedList getHand() {
        return hand;
    }






}
