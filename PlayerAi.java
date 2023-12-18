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
                        sum+=d;
                    }
                }
            }
            if(sum==20) {
                return 1;
            }
        }
        return 0;
    }




    public boolean ai() {
        int sum=0;
        int d=0;
        for(String a : playerboardarray) {
            if(!(a==null)) {
                String holder=a;
                if(holder.substring(1,3).equals("10")) {
                    holder=holder.substring(0,3);
                    d =Integer.parseInt(holder);
                    sum+=d;
                }else {
                    holder=holder.substring(0,2);
                    d =Integer.parseInt(holder);
                    sum+=d;
                }
            }
            if(sum==20) {
                return true;
            }
        }
        return false;
    }
}
