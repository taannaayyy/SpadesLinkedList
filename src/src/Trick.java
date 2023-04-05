//this class is for the trick
public class Trick {

    //attributes for the trick
    // cardsPlayed is for the cards that played in current trick
    //numCardsPlayed is for the number of the cards that played in current trick
    //trumpSuit is for the trump suit which is always Spades
    private LinkedList cardsPlayed;
    private int numCardsPlayed;
    private Suit trumpSuit;

    //constructor
    public Trick() {
        cardsPlayed= new LinkedList();
        numCardsPlayed = 0;
        trumpSuit = Suit.SPADES;
    }

    //getters
    public LinkedList getCards() {
        return cardsPlayed;
    }

    public Suit getTrumpSuit() {
        return trumpSuit;
    }

    public int getNumCardsPlayed() {
        return numCardsPlayed;
    }

    // Add the cards to the trick
    public void addCard(Card card) {

    }

    //method to clear the trick
    public void clearTrick(){
        cardsPlayed.deleteLast();
        cardsPlayed.deleteLast();
        cardsPlayed.deleteLast();
        cardsPlayed.deleteLast();
    }

    //tells if the round is complete or not returns a boolean
    public boolean isComplete() {
        return true;
    }




}