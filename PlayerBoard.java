public class PlayerBoard {
    public String [] gamedeck;
    public String [] player_board;

    public PlayerBoard(String[] gamedeck) {
        this.gamedeck = gamedeck;
        this.player_board = new String[30];
    }


    public  String[] boardPlayer(){

        for(int i=0;i<gamedeck.length;i++) {
            if (!(gamedeck[i]==null)) {
                for(int f=0;f<player_board.length;f++) {
                    if ((player_board[f]==null)) {
                        player_board[f]=gamedeck[i];
                        gamedeck[i]=null;
                        break;
                    }
                }
                break;
            }
        }
        return player_board;
    }

    public  void handToBoard(String[] player_hand,int m){
        boardPlayer();
        m--;
        for(int i=0;i<player_board.length;i++) {
            if((player_board[i]==null)) {
                player_board[i]=player_hand[m];
                break;
            }
        }

    }
}
