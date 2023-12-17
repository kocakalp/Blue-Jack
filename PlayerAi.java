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
                holder=holder.substring(0,2);
                d =Integer.parseInt(holder);
                sum+=d;
            }
            if(sum==20) {
                return true;
            }
        }
        return false;
    }
}
