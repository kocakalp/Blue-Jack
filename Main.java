public class Main {
    public static void main(String[] args) {

        GameDeck game = new GameDeck();

        String [] deck =game.shuffleDeck();//kartarı oluşturu ve shuffle eder

        PlayerDeckPlayer player = new PlayerDeckPlayer(deck); //oyuncuya kartların verilmesi için
        String [] player_hand=player.lastfourCards();

        PlayerDeckComputer computer = new PlayerDeckComputer(deck); //bilgisayara kartların verilmesi için
        String [] computer_hand=computer.lastfourCards();

        String [] gamedeck =game.gameDeck(deck);




        /*for(String b : computer_hand) {
            System.out.println(b);




        for(String c : deck) {
            System.out.println(c);
        }
        System.out.println();
    }
        for(String d: gamedeck) {
            System.out.println(d);
        }
*/


        System.out.println("-------------------------------------------");
        System.out.print("Computer Hand: ");

        for(String b : computer_hand) {
            System.out.print(b+" ");
        }

        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.print("Computer Board: ");
        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.print("Player Board: ");
        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.print("Player Hand : ");
        for(String a : player_hand) {
            System.out.print(a+" ");
        }

        System.out.println();
        System.out.println("-------------------------------------------");





    }

}
