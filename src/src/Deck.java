import java.math.*;
public class Deck {
    //attributes
    private static LinkedList deck;

    //shuffle method to shuffle the deck
    public static void shuffle(){
        System.out.println("shuffled");
    }

    //constructor
    // when this constructor invoked it creates a linked list and fills the deck with a deck of cards.
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

    //method to check if the deck is empty or not
    public static boolean isEmpty(){
        return deck.isEmpty();
    }

    public String toString(){
        return deck.toString();
    }

}
