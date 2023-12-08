import java.util.Random;

public class PlayerDeckPlayer {

    public String [] deck;
    public String [] player_hand;
    public PlayerDeckPlayer(String[] deck) {
        this.deck = deck;
        this.player_hand = new String[5];
    }


    public String[] giveCardstoPlayer(){

        for(int i=0;i < player_hand.length;i++) {
            player_hand[i] = deck[deck.length-1-i];

        }


        return player_hand;
    }


    public  String[] randomthreeCards() {
        Random r = new Random();

        String [] random_3cards = new String [3];
        String [] values = {"1","2","3","4","5","6"};
        String [] colours = {"B","Y","R","G"};
        int [] random_holder = new int[3];//for holding random integer if that integer already seen

        String [] cards = new String[values.length*colours.length];

        int i=0;
        for (String value : values ) {
            for(String colour : colours  ) {
                cards[i] = value + colour;
                i++;
            }
        }

        /*altaki kod bloğunuu çalışma mantığı:
    ilk loopun içinde 1 den 6ya kadar ve 4 renge sahip 24 kard vardır burdaki amaç bu 24 sayıdan 3 sayı radom şekilde almaktır bunu yapabilmek için 0 dan 23 e kadar
    bir random sayı üretilir bu sayıya karşılık gelen sayı random_3cards areyyinin içine aktarılır bu döngü 3 kere tekrar edilir asıl sıkıntı 0 dan 23 e kadar olan sayılardan
     daha önce çıkan bir sayının tekrardan oluşturulmasıdıaır bunu önlemek içinde daha önce çıkan sayılar ayrı bir arreyin içine atılır ve 2. for loop da bü yüzdendir arrayi
     for loop kullanarak daha önce karşılaştığımız random değerlerini tekrardan çıkmasını engeller
     */

        for(int j=0;j<random_holder.length;j++) {

            int random = r.nextInt(cards.length);

            for(int k=0;k<random_holder.length;k++) {
                if(random_holder[k] == random) {
                    random = r.nextInt(cards.length);
                    break;
                }
            }
            random_3cards[j] = cards[random];
            random_holder[j] = random;

            int one_zero = r.nextInt(2);
            String minus_or_plus;

            if(one_zero == 0) {
                minus_or_plus = "-";
            } else {
                minus_or_plus = "+";
            }
            random_3cards[j] =  minus_or_plus + random_3cards[j];
        }

        return random_3cards;


    }

    public  String[] randomtwoCards() {
        Random r = new Random();

        String [] random_2cards = new String [2];

        String special_card= null;

        for(int n=0;n<2;n++) {

            int percentage = r.nextInt(5);

            if (percentage == 4) {
                int v = r.nextInt(2);

                if (v == 1) {
                    special_card = "X2";
                } else {
                    special_card = "(+/-)";
                }
            }

            if (percentage < 4) {

                String[] values = {"1", "2", "3", "4", "5", "6"};
                String[] colours = {"B", "Y", "R", "G"};


                String[] cards = new String[values.length * colours.length];

                int i = 0;
                for (String value : values) {
                    for (String colour : colours) {
                        cards[i] = value + colour;
                        i++;
                    }
                }

                int random = r.nextInt(cards.length);

                special_card=cards[random];


                int one_zero = r.nextInt(2);
                String minus_or_plus;

                if (one_zero == 0) {
                    minus_or_plus = "-";
                } else {
                    minus_or_plus = "+";
                }
                special_card = minus_or_plus +   special_card;
            }

            random_2cards[n] = special_card;
        }
        return random_2cards;
    }


    public  String[] lastfourCards(){
        Random r = new Random();
        String [] randomtwo_Cards = randomtwoCards();
        String [] randomthree_Cards = randomthreeCards();
        String [] giveCardsto_Player = giveCardstoPlayer();
        String [] playing_cards_player = new String [4];
        int [] random_holder = new int[4];

        int b = giveCardsto_Player.length+randomthree_Cards.length+randomtwo_Cards.length;

        String [] allcards = new String [b];

        for(int j =0;j<randomtwo_Cards.length;j++){
            allcards[j] = randomtwo_Cards[j];
        }
        for(int n=randomtwo_Cards.length;n<randomthree_Cards.length+randomtwo_Cards.length;n++){
            allcards[n] = randomthree_Cards[n - randomtwo_Cards.length];
        }
        for(int t= randomtwo_Cards.length + randomthree_Cards.length;t<b;t++){
            allcards[t] = giveCardsto_Player[t - randomtwo_Cards.length - randomthree_Cards.length];
        }





        for(int i = 0;i<random_holder.length ;i++) {

            int random = r.nextInt(b);

            for(int k=0;k<random_holder.length;k++) {
                if(random_holder[k] == random) {
                    random = r.nextInt(b);
                    break;
                }
            }
            playing_cards_player[i] = allcards[random];
            random_holder[i] = random;
        }
        return playing_cards_player;
    }























}
