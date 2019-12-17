package dec_16;

public class Bank {
    private int cash;

    public void setCash(int a){
        if(a >= 0){
            cash = a;
        }
    }

    public int getCash(){
        return cash;
    }

}
