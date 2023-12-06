public class Main {
    public static void main(String[] args) {

        GameDeck game = new GameDeck();

        String [] deck =game.shuffleDeck();//kartarı oluşturu ve shuffle eder

        PlayerDeckPlayer player = new PlayerDeckPlayer(deck); //oyuncuya kartların verilmesi için
        String [] player_hand=player.giveCardstoPlayer();

        PlayerDeckComputer computer = new PlayerDeckComputer(deck); //bilgisayara kartların verilmesi için
        String [] computer_hand=computer.giveCardstoComputer();


        String [] random = game.randomthreeCards();
        for(String r : random) {
            System.out.println(r);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        String [] random2 = game.randomtwoCards();
        for(String r : random2) {
            System.out.println(r);
        }
        System.out.println();
        System.out.println();
        System.out.println();



        /*for(String b : computer_hand) {
            System.out.println(b);
        }

        System.out.println();

        for(String c : deck) {
            System.out.println(c);
        }

        System.out.println();

        for(String a : player_hand) {
            System.out.println(a);
        }*/


    }

}
