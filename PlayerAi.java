public class PlayerAi {
    String [] playerboardarray;

    public PlayerAi(String[] playerboardarray) {
        this.playerboardarray = playerboardarray;
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
