public class PlayerAi {
    String [] playerboardarray;

    public PlayerAi(String[] playerboardarray) {
        this.playerboardarray = playerboardarray;
    }

    public int Bluejack() {
        int sum=0;
        int d=0;
        for(String a : playerboardarray) {
            if (!(a == null)) {
                String holder=a;
                if(holder.equals("(+/-)")||holder.equals("X2")) {
                    return 0;

                }
                if(holder.substring(1,3).equals("10")) {
                    if(holder.substring(3,4).equals("B")) {
                        holder=holder.substring(0,3);
                        d =Integer.parseInt(holder);
                        sum+=d;
                    } else {
                        return 0;
                    }
                } else {
                    if(holder.substring(2,3).equals("B")) {
                        holder=holder.substring(0,2);
                        d =Integer.parseInt(holder);
                        sum+=d;
                    } else {
                        return 0;
                    }
                }
            }
            if(sum==20) {
                return 1;
            } else {
                sum-=d;
            }
        }
        return 0;
    }




    public int ai() {
        int sum=0;
        int d=0;
        int b=0;
        int i=1;
        for(String a : playerboardarray) {
            if(!(a==null)) {
                String holder=a;
                if(holder.equals("(+/-)")) {
                    if(playerboardarray[i-1].equals("(+/-)")||playerboardarray[i-1].equals("X2")) {
                        continue;
                    } else if(playerboardarray[i-1].substring(0,1).equals("-")) {
                        playerboardarray[i-1] =playerboardarray[i-1].replace('-','+');
                        if((playerboardarray[i-1].substring(1,3).equals("10"))) {
                            b =Integer.parseInt(playerboardarray[i-1].substring(0,3));
                            sum=sum+b*2;
                        } else {
                            b =Integer.parseInt(playerboardarray[i-1].substring(0,2));
                            sum=sum+b*2;
                        }
                    } else if(playerboardarray[i-1].substring(0,1).equals("+")){
                        playerboardarray[i-1] =playerboardarray[i-1].replace('+','-');
                        if((playerboardarray[i-1].substring(1,3).equals("10"))) {
                            b =Integer.parseInt(playerboardarray[i-1].substring(0,3));
                            sum=sum+b*2;
                        } else {
                            b =Integer.parseInt(playerboardarray[i-1].substring(0,2));
                            sum=sum+b*2;
                        }
                    }
                } else if(holder.equals("X2")) {
                    if(playerboardarray[i-1].equals("(+/-)")||playerboardarray[i-1].equals("X2")) {
                        continue;
                    } else if((playerboardarray[i-1].substring(1,3).equals("10"))) {
                        b =Integer.parseInt(playerboardarray[i-1].substring(0,3));
                        sum=sum+b;
                    } else {
                        b =Integer.parseInt(playerboardarray[i-1].substring(0,2));
                        sum=sum+b;
                    }

                } else if(holder.substring(1,3).equals("10")) {
                    holder=holder.substring(0,3);
                    d =Integer.parseInt(holder);
                    sum+=d;

                }  else {
                    holder=holder.substring(0,2);
                    d =Integer.parseInt(holder);
                    sum+=d;
                }
            }
            if(sum>=20) {
                return sum;
            }
            i++;
        }
        return -100;
    }
}
