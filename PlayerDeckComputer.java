import java.util.Random;

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





    public static String[] randomthreeCards() {
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


    public static String[] randomtwoCards() {
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



































}
