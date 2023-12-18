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

   /* public int Bluejack() {
        int sum=0;
        int d=0;
        int i=0;
        for( i=0;i<computerboardarray.length;i++) {
            if (!(computerboardarray[i] == null)) {
                String holder = computerboardarray[i];
                if(holder.substring(1,3).equals("10")) {
                    if(holder.substring(3,4).equals("B")) {
                        holder=holder.substring(0,3);
                        d =Integer.parseInt(holder);
                        sum+=d;
                    }
                } else {
                    if(holder.substring(2,3).equals("B")) {
                        holder=holder.substring(0,2);
                        d =Integer.parseInt(holder);
                        sum+= d;
                    }
                }
            }
            if((computerboardarray[i]==null)) {
                break;
            }
        }
        if(sum==20) {
            return 1;
        } else {
            for(int f=0;f<computer_hand.length;f++) {
                if (!(computer_hand[f] == null)) {
                    String holder = computer_hand[f];
                    if(holder.substring(1,3).equals("10")) {
                        if(holder.substring(3,4).equals("B")) {
                            holder=holder.substring(0,3);
                            d =Integer.parseInt(holder);
                            sum+=d;
                        }
                    } else {
                        if(holder.substring(2,3).equals("B")) {
                            holder=holder.substring(0,2);
                            d =Integer.parseInt(holder);
                        }
                    }
                    if(sum+d==20) {
                        computerboardarray[i + 1] = computer_hand[f];
                        computer_hand[f] = null;
                        return 1;
                    }
                }
            }
        }
        return 0;
    }*/

    public int ai() {
        int sum=0;
        int d=0;
        int i=0;
        int over20=0;
        for( i=0;i<computerboardarray.length;i++) {
            if(!(computerboardarray[i]==null)) {
                String holder=computerboardarray[i];
                if(holder.substring(1,3).equals("10")) {
                    holder=holder.substring(0,3);
                    d =Integer.parseInt(holder);
                    sum+=d;
                } else {
                    holder=holder.substring(0,2);
                    d =Integer.parseInt(holder);
                    sum+= d;
                }
            }
            over20=sum;
            if((computerboardarray[i]==null)) {
                break;
            }
        }
        if(sum==20) {
            return 20;
        } else {
            for(int f=0;f<computer_hand.length;f++) {
                if(!(computer_hand[f]==null)) {
                    String holder=computer_hand[f];
                    if(holder.substring(1,3).equals("10")) {
                        holder=holder.substring(0,3);
                        d =Integer.parseInt(holder);
                        sum+=d;
                    }else {
                        holder=holder.substring(0,2);
                        d =Integer.parseInt(holder);
                        sum+=d;
                    }
                    if(sum+d==20) {
                        computerboardarray[i+1]=computer_hand[f];
                        computer_hand[f]=null;
                        return 20;
                    }
                }
            }
        }
        if(over20>20) {
            int max=0;
            int indexOfMax=-1;

            for(int f=0;f<computer_hand.length;f++) {
                if(!(computer_hand[f]==null)) {
                    String holder=computer_hand[f];

                    if(holder.substring(1,3).equals("10")) {
                        holder=holder.substring(0,3);
                    } else {
                        holder=holder.substring(0,2);
                    }
                    d =Integer.parseInt(holder);

                    if(over20-d < 20 && over20-d > max ) {
                        max = over20-d;
                        indexOfMax=f;
                    }
                }
            }
            computerboardarray[i+1]=computer_hand[indexOfMax];
            computer_hand[indexOfMax]=null;
            return indexOfMax;
        }
        return 0;
    }




}
