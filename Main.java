import java.util.Scanner;
public class Main {
    public static void Computerwins() {
        System.out.println();
        System.out.println("Computer Won");
    }

    public static void main(String[] args) {


        GameDeck game = new GameDeck();

        String [] deck =game.shuffleDeck();//kartarı oluşturu ve shuffle eder

        PlayerDeckPlayer player = new PlayerDeckPlayer(deck); //oyuncuya kartların verilmesi için
        String [] player_hand=player.lastfourCards();

        PlayerDeckComputer computer = new PlayerDeckComputer(deck); //bilgisayara kartların verilmesi için
        String [] computer_hand=computer.lastfourCards();

        String [] gamedeck =game.gameDeck(deck);

        PlayerBoard playerboard = new PlayerBoard(gamedeck);
        String [] playerboardarray =playerboard.boardPlayer();

        ComputerBoard computerboard = new ComputerBoard(gamedeck);
        String [] computerboardarray =computerboard.boardComputer();





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


        System.out.println("Oyun Sahasının görünümü");

        System.out.println();
        System.out.println();


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
////////////////////////////////////////////////////////////////////////




        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("İlk Tur oyuncunun boardına kart alma");

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
        for(String f : playerboardarray) {
            if(!(f==null)) {System.out.print(f);}
        }
        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.print("Player Hand : ");
        for(String a : player_hand) {
            System.out.print(a+" ");
        }

        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.println("Use one of your cards: 0->No: 1->Yes" );
        Scanner sc = new Scanner(System.in);
        String v =null;
        int m=1;
        do {
             v= sc.nextLine();
            if (v.equals("1")) {
                System.out.println("Enter a value between 1-4:");
                do {
                    boolean w=true;
                    while(w) {
                        try {
                            m = sc.nextInt();
                            w= false;
                        }catch (Exception e) {
                            sc.nextLine();
                            System.out.println("Invalid value");
                            System.out.println("Enter between 1-4");
                            w=true;
                        }
                    }
                    if(!(1<=m && m<=4)){
                        System.out.println("Enter between 1-4");
                    } else {

                        playerboard.handToBoard(player_hand,m);
                        player.remove(player_hand,m);
                    }
                }while (!(1<=m && m<=4));
            }
            else if(!(v.equals("1")||v.equals("0"))) {
                System.out.println("Invalid value");
                System.out.println("Use one of your cards: 0->No: 1->Yes");
            }
        }while(!(v.equals("1")||v.equals("0")));
        ///////////////////////////////////////////////////////////////////////////////////////


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("OYUNCUNUN HARKETİNİN GÖZÜKMESİ");

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
        playerboard.printPlayerBoard();
        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.print("Player Hand : ");
        for(String a : player_hand) {
            if(!(a==null)) {
                System.out.print(a+" ");
            }
        }

        System.out.println();
        System.out.println("-------------------------------------------");

/////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("2. Tur bilgisayın kart alması");
        System.out.println("-------------------------------------------");
        System.out.print("Computer Hand: ");

        for(String b : computer_hand) {
            System.out.print(b+" ");
        }

        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.print("Computer Board: ");
        for(String f : computerboardarray) {
            if(!(f==null)) {System.out.print(f);}
        }
        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.print("Player Board: ");
        playerboard.printPlayerBoard();
        System.out.println();
        System.out.println("-------------------------------------------");

        System.out.print("Player Hand : ");
        for(String a : player_hand) {
            if(!(a==null)) {
                System.out.print(a+" ");
            }
        }

        System.out.println();
        System.out.println("-------------------------------------------");


///////////////////////////////////////////////////////////////////////////////////////
        for(int d=0;d<gamedeck.length;d++) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.print("Computer Hand: ");
            for(String b : computer_hand) {
                if(!(b==null)) {
                    System.out.print(b + " ");
                }
            }

            System.out.println();
            System.out.println("-------------------------------------------");

            System.out.print("Computer Board: ");
            computerboard.printComputerBoard();
            System.out.println();
            System.out.println("-------------------------------------------");

            System.out.print("Player Board: ");
            playerboardarray =playerboard.boardPlayer();
            for(String f : playerboardarray) {
                if(!(f==null)) {System.out.print(f);}
            }
            System.out.println();
            System.out.println("-------------------------------------------");

            System.out.print("Player Hand : ");
            for(String a : player_hand) {
                if(!(a==null)) {
                    System.out.print(a+" ");
                }
            }

            System.out.println();
            System.out.println("-------------------------------------------");

            System.out.println("Use one of your cards: 0->No: 1->Yes" );
            
            String h =null;
            int q=1;
            do {
                h= sc.nextLine();
                if (h.equals("1")) {
                    System.out.println("Enter a value between 1-4:");
                    do {
                        boolean w=true;
                        while(w) {
                            try {
                                q=sc.nextInt();
                                w = false;
                            }catch (Exception e) {
                                sc.nextLine();
                                System.out.println("Invalid value");
                                System.out.println("Enter between 1-4");
                                w=true;
                            }
                        }
                        if(!(1<=q && q<=4)){
                            System.out.println("Enter between 1-4");
                        } else {

                            playerboard.handToBoard(player_hand,q);
                            player.remove(player_hand,q);
                        }
                    }while (!(1<=q && q<=4));
                }
                else if(!(h.equals("1")||h.equals("0"))) {
                    System.out.println("Invalid value");
                    System.out.println("Use one of your cards: 0->No: 1->Yes");
                }
            }while(!(h.equals("1")||h.equals("0")));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("OYUNCUNUN HARKETİNİN GÖZÜKMESİ");

            System.out.println("-------------------------------------------");
            System.out.print("Computer Hand: ");

            for(String b : computer_hand) {
                System.out.print(b+" ");
            }

            System.out.println();
            System.out.println("-------------------------------------------");

            System.out.print("Computer Board: ");
            computerboard.printComputerBoard();
            System.out.println();
            System.out.println("-------------------------------------------");

            System.out.print("Player Board: ");
            playerboard.printPlayerBoard();
            System.out.println();
            System.out.println("-------------------------------------------");

            System.out.print("Player Hand : ");
            for(String a : player_hand) {
                if(!(a==null)) {
                    System.out.print(a+" ");
                }
            }

            System.out.println();
            System.out.println("-------------------------------------------");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Bilgisayarın Oynaması");
            System.out.println("-------------------------------------------");
            System.out.print("Computer Hand: ");
            for(String b : computer_hand) {
                if(!(b==null)) {
                    System.out.print(b + " ");
                }
            }
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.print("Computer Board: ");
            computerboardarray =computerboard.boardComputer();
            for(String f : computerboardarray) {
                if(!(f==null)) {System.out.print(f);}
            }
            ComputerAi computerai = new ComputerAi(computer_hand,computerboardarray);
            boolean control =computerai.ai();
            System.out.println();
            System.out.println("-------------------------------------------");

            System.out.print("Player Board: ");
            playerboard.printPlayerBoard();
            System.out.println();
            System.out.println("-------------------------------------------");

            System.out.print("Player Hand : ");
            for(String a : player_hand) {
                if(!(a==null)) {
                    System.out.print(a+" ");
                }
            }
///////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("-------------------------------------------");
            if(control) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                
                Computerwins();
                break;

            }
        }




    }

}
