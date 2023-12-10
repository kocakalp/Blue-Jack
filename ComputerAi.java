public class ComputerAi {
    String [] computer_hand;
    String [] computerboardarray;
    ComputerBoard computerBoard;
    PlayerDeckComputer playerDeckComputer;

    //ComputerBoard boardcomputer =new ComputerBoard();
    public ComputerAi(String[] computer_hand, String[] computerboardarray) {
        this.computer_hand = computer_hand;
        this.computerboardarray = computerboardarray;
        this.computerBoard = new ComputerBoard(computer_hand); 
        this.playerDeckComputer = new PlayerDeckComputer(computer_hand);
    }


    public void ai() {
        int sum=0;
        int d=0;
        for(int i=0;i<computerboardarray.length;i++) {
            if(!(computerboardarray[i]==null)) {
                String holder=computerboardarray[i];
                holder=holder.substring(0,2);
                 d =Integer.parseInt(holder);
                sum+= d;
            }
        }
        if(sum==20) {
            System.out.println("Computer make 20");
        } else {
            for(int f=0;f<computer_hand.length;f++) {
                if(!(computer_hand[f]==null)) {
                    String holder=computer_hand[f];
                    holder=holder.substring(0,2);
                     d =Integer.parseInt(holder);
                    if(sum+d==20) {
                        System.out.println("Computer make 20");

                        break;
                    }
                }
            }
        }
    }
}
