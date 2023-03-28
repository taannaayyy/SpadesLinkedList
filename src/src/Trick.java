public class Trick {

    //attributes
    private LinkedList cardsPlayed;
    private int numCardsPlayed;
    private Suit trumpSuit;

    //constructor
    public Trick() {
        cardsPlayed= new LinkedList();
        numCardsPlayed = 0;
        trumpSuit = Suit.SPADES;
    }

    // Add the card to the trick
    public void addCard(Card card) {

        cardsPlayed.getNodeI(numCardsPlayed).data= card;
        numCardsPlayed++;
    }

    //tells if the round is complete or not
    public boolean isComplete() {
        return numCardsPlayed == 4;
    }

    //returns the card that played
    public LinkedList getCards() {
        return cardsPlayed;
    }

    // determine the player with the highest ranking card in the trick
   /* public Player getWinner() {
        int winnerIndex = 0;
        for (int i = 1; i < 4; i++) {
            if (cardsPlayed.getNodeI(i).data.getSuit() == trumpSuit && cardsPlayed[i].getRank() > cardsPlayed[winnerIndex].getRank()) {
                winnerIndex = i;
            } else if (cardsPlayed[i].getSuit() == cardsPlayed[0].getSuit() && cardsPlayed[i].getRank() > cardsPlayed[winnerIndex].getRank()) {
                winnerIndex = i;
            }
        }
        return cardsPlayed[winnerIndex].getPlayer();
    }*/
}