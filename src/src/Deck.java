import java.math.*;
public class Deck {
    //attributes
    private static LinkedList deck;

    //constructor
    public Deck(){
        deck = new LinkedList();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.insertLast(new node(new Card(rank, suit, null)));
            }
        }
    }
    //shuffle method to shuffle the deck
    public static void shuffle(){

    }

    //method to deal the cards to players hand
    public static void dealCards(){

    }

    //method to check if the deck is empty or not
    public static boolean isEmpty(){
        return deck.isEmpty();
    }

    public String toString(){
        return deck.toString();
    }

}
