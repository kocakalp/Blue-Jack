public class PlayerDeckPlayer {

    public String [] deck;
    public String [] player_hand;
    public PlayerDeckPlayer(String[] deck) {
        this.deck = deck;
        this.player_hand = new String[4];
    }


    public String[] giveCardstoPlayer(){

        for(int i=0;i < player_hand.length;i++) {
            player_hand[i] = deck[deck.length-1-i];

        }


        return player_hand;
    }



}
