public class Main {
    public static void main(String[] args) {

        GameDeck game = new GameDeck();

        String [] deck =game.shuffleDeck();

        PlayerDeckPlayer player = new PlayerDeckPlayer(deck);
        String [] player_hand=player.giveCardstoPlayer();





        for(String c : deck) {
            System.out.println(c);
        }
        System.out.println();

        for(String a : player_hand) {
            System.out.println(a);
        }


    }

}
