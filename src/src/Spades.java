import java.util.Scanner;
import java.math.*;
public class Spades {
    //attributes
    private static Deck deck;
    private static Player player1;
    private static Player bot1;
    private static Player bot2;
    private static Player bot3;
    private static int currentRound;
    private static Trick currentTrick;
    //constructor
    public Spades(Player player1,Player bot1,Player bot2,Player bot3,Deck deck){
        this.player1=player1;
        this.bot1=bot1;
        this.bot2=bot2;
        this.bot3=bot3;
        this.deck=deck;
    }
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

    //method to play the game (controls the flow and rules of the game and bot's actions,
    //printing
    //counting score
    //and check if the game is over or not)
    public static void play(){
        Scanner scan = new Scanner(System.in);

        //getting bids
        System.out.println("write your your bid:");
        int player1Bid = scan.nextInt();

        while(player1Bid>13 || player1Bid <0) {
            System.out.println("please make a your bid between 0-13");
            System.out.println("write your your bid:");
            player1Bid = scan.nextInt();
        }

        System.out.println("your bid: "+player1Bid);
        player1.setBid(player1Bid);

        int bot1Bid = (int) ((Math.random() * 14) + 0);
        bot1.setBid(bot1Bid);
        System.out.println("bot1's bid:"+bot1Bid);

        int bot2Bid = (int) ((Math.random() * 14) + 0);
        bot2.setBid(bot2Bid);
        System.out.println("bot2's bid:"+bot2Bid);

        int bot3Bid = (int) ((Math.random() * 14) + 0);
        bot3.setBid(bot3Bid);
        System.out.println("bot3's bid:"+bot3Bid);


        for(int i = 0; i<13; i++){

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
        dealCards();
        System.out.println(deck);
        System.out.println(player1);
        System.out.println(bot1);
        System.out.println(bot2);
        System.out.println(bot3);
        play();

    }

}
