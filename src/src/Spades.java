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
       for(int i =0;i<13;i++) {
           player1.addCardToHand(deck.getDeck().getNodeI(0).getData());
           deck.getDeck().deleteFirst();
       }
       for(int i =0;i<13;i++) {
           bot1.addCardToHand(deck.getDeck().getNodeI(0).getData());
           deck.getDeck().deleteFirst();
       }
       for(int i =0;i<13;i++) {
           bot2.addCardToHand(deck.getDeck().getNodeI(0).getData());
           deck.getDeck().deleteFirst();
       }
       for(int i =0;i<13;i++) {
           bot3.addCardToHand(deck.getDeck().getNodeI(0).getData());
           deck.getDeck().deleteFirst();
       }


    }

    // determines the player with the highest ranking card in the trick and return the player
    /*public Player getWinner() {

    }*/

    //constructor
    public Spades(Player player1,Player bot1,Player bot2,Player bot3,Deck deck){
        this.player1=player1;
        this.bot1=bot1;
        this.bot2=bot2;
        this.bot3=bot3;
        this.deck=deck;
        //deals cards to players hand

    }


    //method to play the game (controls the flow and rules of the game and bot's actions,
    //printing
    //counting score
    //and check if the game is over or not)
    public void play(){
       while(player1.getScore()<500 && bot1.getScore()<500 && bot2.getScore()<500 && bot3.getScore()<500){
            System.out.println("write the index of the card that you want to play");

       }
    }

    //main method
    public static void main(String[] args) {
        player1= new Player("Tanay");
        bot1 = new Player ("bot1");
        bot2 = new Player ("bot2");
        bot3 = new Player ("bot3");
        deck= new Deck();
        Spades spades= new Spades(player1,bot1,bot2,bot3,deck);
        System.out.println(deck);
        System.out.println(player1);
        dealCards();
        System.out.println(deck);
        System.out.println(player1);
        System.out.println(bot1);
        System.out.println(bot2);
        System.out.println(bot3);


    }

}
