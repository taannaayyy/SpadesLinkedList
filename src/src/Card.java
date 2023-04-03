public class Card {

    //attributes
    private Suit suit;
    private Rank rank;
    private Player player;


    //constructor
    public Card(Rank rank,Suit suit,Player player) {
        this.suit = suit;
        this.rank = rank;
        this.player= player;
    }

    // Getters and setters for suit and rank
    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Player getPlayer() {
        return this.player;
    }
    //toString method
    public String toString(){
        return suit+" "+rank;
    }

}
