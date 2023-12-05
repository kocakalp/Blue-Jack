import java.util.Random;
public class GameDeck {
    //public int value;
    //public String colour;

    public static String[] crateDeck() {
        String [] values = {"1","2","3","4","5","6","7","8","9","10"};
        String [] colours = {"B","Y","R","G"};
        String [] cards = new String[values.length*colours.length];

        int i=0;
        for (String value : values ) {
            for(String colour : colours  ) {
                cards[i] = value + colour;
                i++;
            }
        }
        return cards;
    }

    public static String[] shuffleDeck() {
        Random r = new Random();

        String [] cards =crateDeck();

        int i = 0;
        int b = cards.length-1;

        while(i<1100) {
            int a = r.nextInt(crateDeck().length);

            if(b==-1) { b= cards.length-1; }

            String cardholder = cards[a];
            cards[a] = cards[b];
            cards[b] = cardholder;


            i++;
            b--;
        }





        return cards ;
    }









    //For printing cards
        /*for (String card : cards ) {
        System.out.println(card);
    }*/






}
