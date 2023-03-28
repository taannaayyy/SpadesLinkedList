public class Spades {
    //attributes
    private static Deck deck;
    private static Player player1;
    private static Player bot1;
    private static Player bot2;
    private static Player bot3;
    private static int currentRound;
    private static Trick currentTrick;

    //method to deal the cards to players hand
    public static void dealCards(){
        player1.addCardToHand(deck.getDeck().getNodeI(0).getData());
        deck.getDeck().deleteFirst();
    }

    //constructor
    public Spades(Player player1,Player bot1,Player bot2,Player bot3,Deck deck){
        this.player1=player1;
        this.bot1=bot1;
        this.bot2=bot2;
        this.bot3=bot3;
        this.deck=deck;

        //deals cards to players hand
        dealCards();
    }

    //main method
    public static void main(String[] args) {

        //my tests
        player1= new Player("Tanay");
        bot1= new Player("bot1");
        bot2= new Player("bot2");
        bot3= new Player("bot3");
        deck= new Deck();
        Spades spades= new Spades(player1,player1,player1,player1,deck);

        currentTrick= new Trick();
        System.out.println(deck);
        System.out.println(player1);

    }

}
