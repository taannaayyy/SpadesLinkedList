public class Spades {
    //attributes
    private static Deck deck;
    private LinkedList2 players;
    private static Player player1;
    private static Player bot1;
    private static Player bot2;
    private static Player bot3;

    private static int currentRound;
    private Trick currentTrick;

    //constructor
    public Spades(Player player1,Player bot1,Player bot2,Player bot3){
        //adds the players to player linked list
        players.insertLast(new node2(player1));
        //creates a new deck and shuffle it

        //creates players and deal cards to them

        //initialize the round and trick
    }

    //method to play round
    public void playRound(){
      /* // Play multiple tricks until all cards have been played
        while (!deck.isEmpty()) {
            currentTrick = new Trick();
            for (int i = 0; i < players.numberOfElements(); i++) {
                Player currentPlayer = players.getNodeI(i).data;

                // Prompt the player to play a card and add it to the trick
                Card playedCard = currentPlayer.playCard(currentTrick);
                currentTrick.addCard(playedCard);
            }

            // Determine the winner of the trick and add the cards to their pile
            Player trickWinner = currentTrick.getWinner();
            trickWinner.addToPile(currentTrick.getCards());
        }

        // Update the scores and start a new round
        for (Player player : players) {
            player.updateScore();
        }
        currentRound++;
        deck = new Deck();
        deck.shuffle();
        deck.dealCards(players);*/
    }



    public static void main(String[] args) {
        deck= new Deck();
        System.out.println(deck);
    }

}
