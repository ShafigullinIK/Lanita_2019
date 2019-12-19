package dec_19;

public class Vault {

    int value = 0;

    public synchronized void changeValue(int a){
        value += a;
    }
}
