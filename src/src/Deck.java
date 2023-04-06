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

        deck.insertLast(new node(new Card(Rank.ACE,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.KING,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.QUEEN,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.JACK,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.TEN,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.NINE,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.EIGHT,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.SEVEN,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.SIX,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.FIVE,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.FOUR,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.THREE,Suit.SPADES,null)));
        deck.insertLast(new node(new Card(Rank.TWO,Suit.SPADES,null)));

        deck.insertLast(new node(new Card(Rank.ACE,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.KING,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.QUEEN,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.JACK,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.TEN,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.NINE,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.EIGHT,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.SEVEN,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.SIX,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.FIVE,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.FOUR,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.THREE,Suit.DIAMONDS,null)));
        deck.insertLast(new node(new Card(Rank.TWO,Suit.DIAMONDS,null)));

        deck.insertLast(new node(new Card(Rank.ACE,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.KING,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.QUEEN,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.JACK,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.TEN,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.NINE,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.EIGHT,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.SEVEN,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.SIX,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.FIVE,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.FOUR,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.THREE,Suit.CLUBS,null)));
        deck.insertLast(new node(new Card(Rank.TWO,Suit.CLUBS,null)));

        deck.insertLast(new node(new Card(Rank.ACE,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.KING,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.QUEEN,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.JACK,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.TEN,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.NINE,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.EIGHT,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.SEVEN,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.SIX,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.FIVE,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.FOUR,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.THREE,Suit.HEARTS,null)));
        deck.insertLast(new node(new Card(Rank.TWO,Suit.HEARTS,null)));
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
