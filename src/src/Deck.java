import java.math.*;
public class Deck {
    //attributes
    private static LinkedList deck;

    //shuffle method to shuffle the deck
    public static void shuffle(){
        int num =0;
        while(num<113){
            int a = (int) ((Math.random() * 52) + 0);
            deck.insertLast(new node(deck.getNodeI(a).getData()));
            if(deck.getNodeI(a)==deck.getNodeI(0)){
                deck.deleteFirst();
            }
            else if (deck.getNodeI(a)==deck.getNodeI(51)) {
                deck.deleteLast();
            }
            else {
                deck.deleteMiddle(deck.getNodeI(a));
            }
            num++;
        }
    }

    //constructor
    // when this constructor invoked it creates a linked list and fills the deck with a deck of cards.
    //and shuffles it
    public Deck(){
        deck = new LinkedList();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.insertLast(new node(new Card(rank, suit, null)));
            }
        }
        shuffle();
    }

    //getter method to get the deck
    public LinkedList getDeck(){
        return deck;
    }

    public static void setDeck(LinkedList deck) {
        Deck.deck = deck;
    }

    //method to check if the deck is empty or not
    public static boolean isEmpty(){
        return deck.isEmpty();
    }

    public String toString(){
        return deck.toString();
    }

}
