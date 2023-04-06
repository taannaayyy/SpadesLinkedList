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
    public static Player getWinner() {
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        for(int i = 1; i<5;i++){
            switch (currentTrick.getCards().getNodeI(i-1).getData().getRank()) {
                case ACE:
                    switch (i) {
                        case 1:
                            first = first + 13;
                            break;
                        case 2:
                            second=second+13;
                            break;
                        case 3:
                            third=third+13;
                            break;
                        case 4:
                            fourth=fourth+13;
                            break;
                    }
                    break;

                case KING:
                    switch (i) {
                        case 1:
                            first = first + 12;
                            break;
                        case 2:
                            second=second+12;
                            break;
                        case 3:
                            third=third+12;
                            break;
                        case 4:
                            fourth=fourth+12;
                            break;
                    }
                    break;
                case QUEEN:
                    switch (i) {
                        case 1:
                            first = first + 11;
                            break;
                        case 2:
                            second=second+11;
                            break;
                        case 3:
                            third=third+11;
                            break;
                        case 4:
                            fourth=fourth+11;
                            break;
                    }
                    break;
                case JACK:
                    switch (i) {
                        case 1:
                            first = first + 10;
                            break;
                        case 2:
                            second=second+10;
                            break;
                        case 3:
                            third=third+10;
                            break;
                        case 4:
                            fourth=fourth+10;
                            break;
                    }
                    break;
                case NINE:
                    switch (i) {
                        case 1:
                            first = first + 9;
                            break;
                        case 2:
                            second=second+9;
                            break;
                        case 3:
                            third=third+9;
                            break;
                        case 4:
                            fourth=fourth+9;
                            break;
                    }
                    break;
                case EIGHT:
                    switch (i) {
                        case 1:
                            first = first + 8;
                            break;
                        case 2:
                            second=second+8;
                            break;
                        case 3:
                            third=third+8;
                            break;
                        case 4:
                            fourth=fourth+8;
                            break;
                    }
                    break;
                case SEVEN:
                    switch (i) {
                        case 1:
                            first = first + 7;
                            break;
                        case 2:
                            second=second+7;
                            break;
                        case 3:
                            third=third+7;
                            break;
                        case 4:
                            fourth=fourth+7;
                            break;
                    }
                    break;
                case SIX:
                    switch (i) {
                        case 1:
                            first = first + 6;
                            break;
                        case 2:
                            second=second+6;
                            break;
                        case 3:
                            third=third+6;
                            break;
                        case 4:
                            fourth=fourth+6;
                            break;
                    }
                    break;
                case FIVE:
                    switch (i) {
                        case 1:
                            first = first + 5;
                            break;
                        case 2:
                            second=second+5;
                            break;
                        case 3:
                            third=third+5;
                            break;
                        case 4:
                            fourth=fourth+5;
                            break;
                    }
                    break;
                case FOUR:
                    switch (i) {
                        case 1:
                            first = first + 4;
                            break;
                        case 2:
                            second=second+4;
                            break;
                        case 3:
                            third=third+4;
                            break;
                        case 4:
                            fourth=fourth+4;
                            break;
                    }
                    break;
                case THREE:
                    switch (i) {
                        case 1:
                            first = first + 3;
                            break;
                        case 2:
                            second=second+3;
                            break;
                        case 3:
                            third=third+3;
                            break;
                        case 4:
                            fourth=fourth+3;
                            break;
                    }
                    break;
                case TWO:
                    switch (i) {
                        case 1:
                            first = first + 2;
                            break;
                        case 2:
                            second=second+2;
                            break;
                        case 3:
                            third=third+2;
                            break;
                        case 4:
                            fourth=fourth+2;
                            break;
                    }
                    break;
            }
        }
        for(int i =0;i<4;i++){
            if(currentTrick.getCards().getNodeI(i).getData().getSuit()==Suit.SPADES){
                switch (i+1) {
                    case 1:
                        first = first + 1000;
                        break;
                    case 2:
                        second = second + 1000;
                        break;
                    case 3:
                        third = third + 1000;
                        break;
                    case 4:
                        fourth = fourth + 1000;
                        break;
                }
            }
            else if (currentTrick.getCards().getNodeI(i).getData().getSuit()==currentTrick.getCards().getNodeI(0).getData().getSuit()){
                switch (i+1) {
                    case 1:
                        first = first + 100;
                        break;
                    case 2:
                        second = second + 100;
                        break;
                    case 3:
                        third = third + 100;
                        break;
                    case 4:
                        fourth = fourth + 100;
                        break;
                }
            }
        }
        int biggest = first;

        if (second > biggest) {
            biggest = second;
        }

        if (third > biggest) {
            biggest = third;
        }

        if (fourth > biggest) {
            biggest = fourth;
        }
        if(biggest==first){
            return player1;
        }
        if(biggest==second){
            return bot1;
        }
        if(biggest==third){
            return bot2;
        }
        else return bot3;

    }





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
            System.out.println("please make your bid between 0-13");
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


            System.out.println("round: "+(currentRound+1));
            System.out.println("the game is broken: "+Broken);
            System.out.println("your hand: "+player1.getHand());
            System.out.println("bot1's hand: "+bot1.getHand());
            System.out.println("bot2's hand: "+bot2.getHand());
            System.out.println("bot3's hand: "+bot3.getHand());

            System.out.println("write the index of the card that you want to play");
            int inx = scan.nextInt();

            //conditions for user
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
            //if the bot is able to follow the leading suit
            for (int j = 0; j < 13 - currentRound; j++) {
                if (currentTrick.getCards().numberOfElements() == 1) {
                    if (currentTrick.getCards().getNodeI(0).getData().getSuit() == bot1.getHand().getNodeI(j).getData().getSuit()) {
                        currentTrick.getCards().insertLast(new node(new Card(bot1.getHand().getNodeI(j).getData().getRank(), bot1.getHand().getNodeI(j).getData().getSuit(),bot1)));
                        System.out.println(bot1.getName()+" played "+ bot1.getHand().getNodeI(j).getData().getRank()+" of "+bot1.getHand().getNodeI(j).getData().getSuit());
                        if(currentTrick.getCards().numberOfElements()==2){
                            if(j==0){
                                bot1.getHand().deleteFirst();
                            } else {
                                bot1.getHand().deleteMiddle(bot1.getHand().getNodeI(j));
                            }
                        }
                    }
                }
            }
            //if the bot can not follow the leading suit it plays spades
            for (int l = 0; l < 13 - currentRound; l++) {
                if (currentTrick.getCards().numberOfElements() == 1) {
                    if (bot1.getHand().getNodeI(l).getData().getSuit() == Suit.SPADES) {
                        Broken = true;
                        currentTrick.getCards().insertLast(new node(new Card(bot1.getHand().getNodeI(l).getData().getRank(), bot1.getHand().getNodeI(l).getData().getSuit(),bot1)));
                        System.out.println(bot1.getName()+" played "+ bot1.getHand().getNodeI(l).getData().getRank()+" of "+bot1.getHand().getNodeI(l).getData().getSuit());
                        if(currentTrick.getCards().numberOfElements()==2){
                            if(l==0){
                                bot1.getHand().deleteFirst();
                            } else {
                                bot1.getHand().deleteMiddle(bot1.getHand().getNodeI(l));
                            }
                        }
                    }
                }
            }
            //if the bot can not follow the leading suit and also has not any spades it plays the first card on its hand
            if (currentTrick.getCards().numberOfElements() == 1) {
                currentTrick.getCards().insertLast(new node(new Card(bot1.getHand().getNodeI(0).getData().getRank(), bot1.getHand().getNodeI(0).getData().getSuit(),bot1)));
                System.out.println(bot1.getName()+" played "+ bot1.getHand().getNodeI(0).getData().getRank()+" of "+bot1.getHand().getNodeI(0).getData().getSuit());
                bot1.getHand().deleteFirst();
            }

            //adding card to a trick for bot2
            //if the bot is able to follow the leading suit
            for (int j = 0; j < 13 - currentRound; j++) {
                if (currentTrick.getCards().numberOfElements() == 2) {
                    if (currentTrick.getCards().getNodeI(0).getData().getSuit() == bot2.getHand().getNodeI(j).getData().getSuit()) {
                        currentTrick.getCards().insertLast(new node(new Card(bot2.getHand().getNodeI(j).getData().getRank(), bot2.getHand().getNodeI(j).getData().getSuit(),bot2)));
                        System.out.println(bot2.getName()+" played "+ bot2.getHand().getNodeI(j).getData().getRank()+" of "+bot2.getHand().getNodeI(j).getData().getSuit());
                        if(currentTrick.getCards().numberOfElements()==3){
                            if(j==0){
                                bot2.getHand().deleteFirst();
                            } else {
                                bot2.getHand().deleteMiddle(bot2.getHand().getNodeI(j));
                            }
                        }
                    }
                }
            }
            //if the bot can not follow the leading suit it plays spades
            for (int l = 0; l < 13 - currentRound; l++) {
                if (currentTrick.getCards().numberOfElements() == 2) {
                    if (bot2.getHand().getNodeI(l).getData().getSuit() == Suit.SPADES) {
                        Broken = true;
                        currentTrick.getCards().insertLast(new node(new Card(bot2.getHand().getNodeI(l).getData().getRank(), bot2.getHand().getNodeI(l).getData().getSuit(),bot2)));
                        System.out.println(bot2.getName()+" played "+ bot2.getHand().getNodeI(l).getData().getRank()+" of "+bot2.getHand().getNodeI(l).getData().getSuit());
                        if(currentTrick.getCards().numberOfElements()==3){
                            if(l==0){
                                bot2.getHand().deleteFirst();
                            } else {
                                bot2.getHand().deleteMiddle(bot2.getHand().getNodeI(l));
                            }
                        }
                    }
                }
            }
            //if the bot can not follow the leading suit and also has not any spades it plays the first card on its hand
            if (currentTrick.getCards().numberOfElements() == 2) {
                currentTrick.getCards().insertLast(new node(new Card(bot2.getHand().getNodeI(0).getData().getRank(), bot2.getHand().getNodeI(0).getData().getSuit(),bot2)));
                System.out.println(bot2.getName()+" played "+ bot2.getHand().getNodeI(0).getData().getRank()+" of "+bot2.getHand().getNodeI(0).getData().getSuit());
                bot2.getHand().deleteFirst();
            }

            //adding card to a trick for bot3
            //if the bot is able to follow the leading suit
            for (int j = 0; j < 13 - currentRound; j++) {
                if (currentTrick.getCards().numberOfElements() == 3) {
                    if (currentTrick.getCards().getNodeI(0).getData().getSuit() == bot3.getHand().getNodeI(j).getData().getSuit()) {
                        currentTrick.getCards().insertLast(new node(new Card(bot3.getHand().getNodeI(j).getData().getRank(), bot3.getHand().getNodeI(j).getData().getSuit(),bot3)));
                        System.out.println(bot3.getName()+" played "+ bot3.getHand().getNodeI(j).getData().getRank()+" of "+bot3.getHand().getNodeI(j).getData().getSuit());
                        if(currentTrick.getCards().numberOfElements()==4){
                            if(j==0){
                                bot3.getHand().deleteFirst();
                            } else {
                                bot3.getHand().deleteMiddle(bot3.getHand().getNodeI(j));
                            }
                        }
                    }
                }
            }
            //if the bot can not follow the leading suit it plays spades
            for (int l = 0; l < 13 - currentRound; l++) {
                if (currentTrick.getCards().numberOfElements() == 3) {
                    if (bot3.getHand().getNodeI(l).getData().getSuit() == Suit.SPADES) {
                        Broken = true;
                        currentTrick.getCards().insertLast(new node(new Card(bot3.getHand().getNodeI(l).getData().getRank(), bot3.getHand().getNodeI(l).getData().getSuit(),bot3)));
                        System.out.println(bot3.getName()+" played "+ bot3.getHand().getNodeI(l).getData().getRank()+" of "+bot3.getHand().getNodeI(l).getData().getSuit());
                        if(currentTrick.getCards().numberOfElements()==4){
                            if(l==0){
                                bot3.getHand().deleteFirst();
                            } else {
                                bot3.getHand().deleteMiddle(bot3.getHand().getNodeI(l));
                            }
                        }
                    }
                }
            }
            //if the bot can not follow the leading suit and also has not any spades it plays the first card on its hand
            if (currentTrick.getCards().numberOfElements() == 3) {
                currentTrick.getCards().insertLast(new node(new Card(bot3.getHand().getNodeI(0).getData().getRank(), bot3.getHand().getNodeI(0).getData().getSuit(),bot3)));
                System.out.println(bot3.getName()+" played "+ bot3.getHand().getNodeI(0).getData().getRank()+" of "+bot3.getHand().getNodeI(0).getData().getSuit());
                bot3.getHand().deleteFirst();
            }

            getWinner().setNumofTricks((getWinner().getNumofTricks()+1));
            System.out.println("Trick: "+currentTrick.getCards());
            System.out.println(getWinner().getName()+" takes");
            currentRound++;
            currentTrick.clearTrick();
            //end of the trick
        }

        //end of the deck
        //output of the number of the tricks that players took
        System.out.println("player 1's trick: "+player1.getNumofTricks());
        System.out.println("bot1's tricks: "+bot1.getNumofTricks());
        System.out.println("bot2's tricks: "+bot2.getNumofTricks());
        System.out.println("bot3's tricks: "+bot3.getNumofTricks()+"\n");


        //adding scores related to players bids and scores
        if (player1Bid>player1.getNumofTricks()&&player1Bid!=0){
            player1.setScore(player1.getScore()-(player1.getBid()*10));
        } else if (player1.getNumofTricks()>=player1Bid&&player1Bid!=0) {
            player1.setScore(player1.getScore()+(player1Bid*10)+(player1.getNumofTricks()-player1Bid));
        } else if(player1Bid==0&&player1.getNumofTricks()==0){
            player1.setScore(player1.getScore()+100);
        } else if (player1Bid==0&&player1.getNumofTricks()!=0) {
            player1.setScore(player1.getScore()-100);
        }

        if (bot1Bid>bot1.getNumofTricks()&&bot1Bid!=0){
            bot1.setScore(bot1.getScore()-(bot1.getBid()*10));
        } else if (bot1.getNumofTricks()>=bot1Bid&&bot1Bid!=0) {
            bot1.setScore(bot1.getScore()+(bot1Bid*10)+(bot1.getNumofTricks()-bot1Bid));
        }else if(bot1Bid==0&&bot1.getNumofTricks()==0){
            bot1.setScore(bot1.getScore()+100);
        } else if (bot1Bid==0&&bot1.getNumofTricks()!=0) {
            bot1.setScore(bot1.getScore()-100);
        }

        if (bot2Bid>bot2.getNumofTricks()&&bot2Bid!=0){
            bot2.setScore(bot2.getScore()-(bot2.getBid()*10));
        } else if (bot2.getNumofTricks()>=bot2Bid&&bot2Bid!=0) {
            bot2.setScore(bot2.getScore()+(bot2Bid*10)+(bot2.getNumofTricks()-bot2Bid));
        }else if(bot2Bid==0&&bot2.getNumofTricks()==0){
            bot2.setScore(bot2.getScore()+100);
        } else if (bot2Bid==0&&bot2.getNumofTricks()!=0) {
            bot2.setScore(bot2.getScore()-100);
        }

        if (bot3Bid>bot3.getNumofTricks()&&bot3Bid!=0){
            bot3.setScore(bot3.getScore()-(bot3.getBid()*10));
        } else if (bot3.getNumofTricks()>=bot3Bid&&bot3Bid!=0) {
            bot3.setScore(bot3.getScore()+(bot3Bid*10)+(bot3.getNumofTricks()-bot3Bid));
        }else if(bot3Bid==0&&bot3.getNumofTricks()==0){
            bot3.setScore(bot3.getScore()+100);
        } else if (bot3Bid==0&&bot3.getNumofTricks()!=0) {
            bot3.setScore(bot3.getScore()-100);
        }
        System.out.println("player 1's score: "+player1.getScore());
        System.out.println("bot1's score: "+bot1.getScore());
        System.out.println("bot2's score: "+bot2.getScore());
        System.out.println("bot3's score: "+bot3.getScore());

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
        System.out.println(player1);
        System.out.println(bot1);
        System.out.println(bot2);
        System.out.println(bot3);
        while(player1.getScore()<5&&bot1.getScore()<500&&bot2.getScore()<500&&bot3.getScore()<500){
            play();
        }


    }

}
