public class Main {
    public static void main(String[] args) {

        GameDeck a = new GameDeck();

        String [] decks =a.shuffleDeck();
        for(String deck : decks) {
            System.out.println(deck);
        }



    }

}