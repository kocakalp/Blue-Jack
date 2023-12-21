import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Formatter ;
import java.io.FileWriter ;
public class Main {
    public static void Computerwins() {
        System.out.println();
        System.out.println("Computer Won");
    }
    public static void Playerwins() {
        System.out.println();
        System.out.println("Player Won");
    }
    public static void Draw() {
        System.out.println();
        System.out.println("No one gets point");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int playerWins = 0;
        int computerWins = 0;
        while(playerWins < 3 && computerWins < 3) {
            GameDeck game = new GameDeck();

            String[] deck = game.shuffleDeck();//kartarı oluşturu ve shuffle eder

            PlayerDeckPlayer player = new PlayerDeckPlayer(deck); //oyuncuya kartların verilmesi için
            String[] player_hand = player.lastfourCards();

            PlayerDeckComputer computer = new PlayerDeckComputer(deck); //bilgisayara kartların verilmesi için
            String[] computer_hand = computer.lastfourCards();

            String[] gamedeck = game.gameDeck(deck);

            PlayerBoard playerboard = new PlayerBoard(gamedeck);
            String[] playerboardarray = playerboard.boardPlayer();

            ComputerBoard computerboard = new ComputerBoard(gamedeck);
            String[] computerboardarray = computerboard.boardComputer();

            int c=0;
            boolean stand = false;
            boolean standcomputer = false;
            int control =0;
            boolean dontwanttorun=false;
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
            System.out.println("Computer :"+computerWins );
            System.out.println("Player :"+playerWins );

            System.out.println("Oyun Sahasının görünümü");

            System.out.println();
            System.out.println();


            System.out.println("-------------------------------------------");
            System.out.print("Computer Hand: ");

            for (String b : computer_hand) {
                System.out.print(b + " ");
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
            for (String a : player_hand) {
                System.out.print(a + " ");
            }

            System.out.println();
            System.out.println("-------------------------------------------");
////////////////////////////////////////////////////////////////////////
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
///////////////////////////////////////////////////////////////////////////////////////
            for (int d = 0; d < gamedeck.length; d++) {
                System.out.println();
                System.out.println();
                System.out.println();
               if(!(stand)) {
                   System.out.println("-------------------------------------------");
                   System.out.print("Computer Hand: ");
                   for (String b : computer_hand) {
                       if (!(b == null)) {
                           System.out.print(b + " ");
                       }
                   }

                   System.out.println();
                   System.out.println("-------------------------------------------");

                   System.out.print("Computer Board: ");
                   if (c > 0) {
                       computerboard.printComputerBoard();
                   }
                   System.out.println();
                   System.out.println("-------------------------------------------");

                   System.out.print("Player Board: ");
                   if (c > 0) {
                       playerboardarray = playerboard.boardPlayer();
                   }

                   for (String f : playerboardarray) {
                       if (!(f == null)) {
                           System.out.print(f);
                       }
                   }
                   System.out.println();
                   System.out.println("-------------------------------------------");

                   System.out.print("Player Hand : ");
                   for (String a : player_hand) {
                       if (!(a == null)) {
                           System.out.print(a + " ");
                       }
                   }

                   System.out.println();
                   System.out.println("-------------------------------------------");

                   System.out.println("End your turn---> Press: 0");
                   System.out.println("Use one of your cards---> Press: 1");
                   System.out.println("Stand---> Press: 2");
                   String h = null;
                   int q = 1;
                   do {
                       h = sc.nextLine();
                       if (h.equals("1")) {
                           System.out.println("Enter a value between 1-4:");
                           do {
                               boolean w = true;
                               while (w) {
                                   try {
                                       q = sc.nextInt();
                                       sc.nextLine();
                                       w = false;
                                   } catch (Exception e) {
                                       sc.nextLine();
                                       System.out.println("Invalid value");
                                       System.out.println("Enter between 1-4");
                                       w = true;
                                   }
                               }
                               if (!(1 <= q && q <= 4)) {
                                   System.out.println("Enter between 1-4");
                               } else {

                                   playerboard.handToBoard(player_hand, q);
                                   player.remove(player_hand, q);
                               }
                           } while (!(1 <= q && q <= 4));
                       } else if (!(h.equals("1") || h.equals("0") || h.equals("2"))) {
                           System.out.println("Invalid value");
                           System.out.println("End your turn---> Press: 0");
                           System.out.println("Use one of your cards---> Press: 1");
                           System.out.println("Stand---> Press: 2");
                       } else if (h.equals("2")) {
                           System.out.println("You chose to stand");
                           stand = true;
                       }
                   } while (!(h.equals("1") || h.equals("0") || h.equals("2")));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                   System.out.println();
                   System.out.println();
                   System.out.println();
                   System.out.println();
                   System.out.println();

                   System.out.println("OYUNCUNUN HARKETİNİN GÖZÜKMESİ");

                   System.out.println("-------------------------------------------");
                   System.out.print("Computer Hand: ");

                   for (String b : computer_hand) {
                       if (!(b == null)) {
                           System.out.print(b + " ");
                       }
                   }
                   System.out.println();
                   System.out.println("-------------------------------------------");

                   System.out.print("Computer Board: ");
                   if (c > 0) {
                       computerboard.printComputerBoard();
                   }
                   System.out.println();
                   System.out.println("-------------------------------------------");

                   System.out.print("Player Board: ");
                   playerboard.printPlayerBoard();
                   System.out.println();
                   System.out.println("-------------------------------------------");

                   System.out.print("Player Hand : ");
                   for (String a : player_hand) {
                       if (!(a == null)) {
                           System.out.print(a + " ");
                       }
                   }

                   System.out.println();
                   System.out.println("-------------------------------------------");

               }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                System.out.println();
                System.out.println();
                System.out.println();
                if(!(standcomputer)) {
                System.out.println("Bilgisayarın Oynaması");
                    if (c > 0) {
                        computerboardarray = computerboard.boardComputer();
                    }
                    ComputerAi computerai = new ComputerAi(computer_hand, computerboardarray);
                    int bluejack1 =computerai.Bluejack();
                    control = computerai.ai();
                    if(control!=-100) {
                        standcomputer=true;
                    }
                    System.out.println("-------------------------------------------");
                    System.out.print("Computer Hand: ");
                    for (String b : computer_hand) {
                        if (!(b == null)) {
                            System.out.print(b + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("-------------------------------------------");
                    System.out.print("Computer Board: ");



                    for (String f : computerboardarray) {
                        if (!(f == null)) {
                            System.out.print(f);
                        }
                    }

                    System.out.println();
                    System.out.println("-------------------------------------------");

                    System.out.print("Player Board: ");
                    playerboard.printPlayerBoard();
                    System.out.println();
                    System.out.println("-------------------------------------------");

                    System.out.print("Player Hand : ");
                    for (String a : player_hand) {
                        if (!(a == null)) {
                            System.out.print(a + " ");
                        }
                    }
///////////////////////////////////////////////////////////////////////////////////////////////////////
                    System.out.println();
                    System.out.println("-------------------------------------------");
                    if(computerboardarray[8]!=null){
                        standcomputer=true;
                    }
                }
                c++;
                PlayerAi playerai = new PlayerAi(playerboardarray);

                int bluejack = playerai.Bluejack();
                if (bluejack == 1) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Bluejack by player");
                    playerWins = +3;
                    break;
                }

                /*if(bluejack1==1) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Bluejack by computer");
                    computerWins=+3;
                    break;
                }*/

                int controlplayer = playerai.ai();

                if(controlplayer!=-100||stand) {
                     dontwanttorun=true;
                     stand = true;
                }

                if(standcomputer && dontwanttorun ) {
                    if(controlplayer>20) {
                        if(control>20) {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();

                            Draw();
                            break;

                        } else if(control<=20&&control>0) {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();

                            Computerwins();
                            computerWins++;
                            break;
                        }

                    } else if(controlplayer==20) {
                        if(control==20) {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();

                            Draw();
                            break;

                        } else {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();

                            Playerwins();
                            playerWins++;
                            break;
                        }

                    } else {
                        if(control==20) {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();

                            Computerwins();
                            computerWins++;
                            break;

                        } else if(controlplayer<control) {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();

                            Computerwins();
                            computerWins++;
                            break;

                        } else if(controlplayer>control) {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();

                            Playerwins();
                            playerWins++;
                            break;

                        } else if(controlplayer==control) {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();

                            Draw();
                            break;
                        }

                    }
                }
            }
        }
        if (playerWins >= 3) {
            System.out.println("Player is the overall winner!");
        } else if(computerWins >= 3) {
            System.out.println("Computer is the overall winner!");
        }

        System.out.println("Enter your name...");
        String name=sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        Formatter f = null;
        FileWriter fw = null;

        try {
            // Read existing entries from the file
            String[] entries = readEntries("players.txt");

            // Add the new entry
            String newEntry = String.format("%s:%s - Computer:%s, %s", name, playerWins, computerWins, LocalDate.now().format(formatter));

            // Shift the array to make room for the new entry
            for (int i = entries.length - 1; i > 0; i--) {
                entries[i] = entries[i - 1];
            }

            // Insert the new entry at the beginning of the array
            entries[0] = newEntry;

            // Write the updated entries back to the file
            fw = new FileWriter("players.txt");
            f = new Formatter(fw);
            for (String entry : entries) {
                if (entry != null) {
                    f.format("%s%n", entry);
                }
            }
        } catch (Exception e) {
            System.err.println("Unable to write to the file....");
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.err.println("Error closing file.");
            }
        }
    }

    private static String[] readEntries(String fileName) {
        String[] entries = new String[10];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null && index < entries.length) {
                entries[index++] = line;
            }
        } catch (Exception e) {
            System.err.println("Unable to read from the file....");
        }
        return entries;
    }













}
