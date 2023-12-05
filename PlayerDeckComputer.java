public class PlayerDeckComputer {
    public String [] deck;
    public String [] computer_hand;
    public PlayerDeckComputer(String[] deck) {
        this.deck = deck;
        this.computer_hand = new String[5];
    }


    public String[] giveCardstoComputer(){

        for(int i=0;i < computer_hand.length;i++) {
            computer_hand[i] = deck[i];

        }


        return computer_hand;
    }
}
