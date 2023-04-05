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
        currentRound=0;
        currentTrick = new Trick();
        boolean Broken = false;

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

        //adding a card to a Trick for user
        for(int i = 0; i<13; i++){
            if(!Broken){
                Broken=true;
                for(int k=0;k<13-i; k++){
                    if(player1.getHand().getNodeI(k).getData().getSuit()!=Suit.SPADES){
                        Broken=false;
                    }
                }
            }


            System.out.println("\n"+"round: "+(currentRound+1));
            System.out.println("the game is broken: "+Broken);
            System.out.println("your hand: "+player1.getHand());
            System.out.println("write the index of the card that you want to play");
            int inx = scan.nextInt();
            while(inx<0 || inx>13-currentRound-1) {
                System.out.println("enter a correct number, try again");
                inx = scan.nextInt();
            }
            if(!Broken){
                while(player1.getHand().getNodeI(inx).getData().getSuit()==Suit.SPADES){
                    if (!Broken) {
                        System.out.println("you can not play Spades yet");
                        System.out.println("write the index of the card that you want to play");
                        inx = scan.nextInt();
                        while(inx<0 || inx>13-currentRound-1) {
                            System.out.println("enter a correct number, try again");
                            inx = scan.nextInt();
                        }
                    }
                }
            }




            //adding users card to trick
            currentTrick.getCards().insertLast(new node (new Card(player1.getHand().getNodeI(inx).getData().getRank(),player1.getHand().getNodeI(inx).getData().getSuit(),player1)));
            System.out.println(player1.getName()+" played "+ player1.getHand().getNodeI(inx).getData().getRank()+" of "+player1.getHand().getNodeI(inx).getData().getSuit());
            if(inx==0){
                player1.getHand().deleteFirst();
            } else {
                player1.getHand().deleteMiddle(player1.getHand().getNodeI(inx));
            }

            //adding bots' cards to trick
            if(!Broken) {
                for (int j = 0; j < 13 - currentRound; j++) {
                    if (currentTrick.getCards().getNodeI(0).getData().getSuit() == bot1.getHand().getNodeI(j).getData().getSuit()) {
                        if (currentTrick.getCards().numberOfElements() == 1) {
                            currentTrick.getCards().insertLast(new node(new Card(bot1.getHand().getNodeI(j).getData().getRank(), bot1.getHand().getNodeI(j).getData().getSuit(),bot1)));
                            System.out.println(bot1.getName()+" played "+ bot1.getHand().getNodeI(j).getData().getRank()+" of "+bot1.getHand().getNodeI(j).getData().getSuit());
                        }

                    }
                }
                for (int l = 0; l < 13 - currentRound; l++) {
                    if (currentTrick.getCards().numberOfElements() == 1) {
                        if (bot1.getHand().getNodeI(l).getData().getSuit() == Suit.SPADES) {
                            Broken = true;
                            currentTrick.getCards().insertLast(new node(new Card(bot1.getHand().getNodeI(l).getData().getRank(), bot1.getHand().getNodeI(l).getData().getSuit(),bot1)));
                        }
                    }
                }
            }
            else {
                for(int m=0;m<13-currentRound;m++){

                }
            }


            System.out.println("Trick: "+currentTrick.getCards());
            currentRound++;
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
