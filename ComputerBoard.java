public class ComputerBoard {
    public String [] gamedeck;
    public String [] computer_board;

    public ComputerBoard(String[] gamedeck) {
        this.gamedeck = gamedeck;
        this.computer_board = new String[30];
    }


    public  String[] boardComputer(){

        for(int i=0;i<gamedeck.length;i++) {
            if (!(gamedeck[i]==null)) {
                for(int f=0;f<computer_board.length;f++) {
                    if ((computer_board[f]==null)) {
                        computer_board[f]=gamedeck[i];
                        gamedeck[i]=null;
                        break;
                    }
                }
                break;
            }
        }
        return computer_board;
    }
}
