package dec_19;

public class MinVault implements Runnable {

    Vault v;

    public MinVault(Vault v) {
        this.v = v;
    }

    @Override
    public void run() {
        for (int i = 0; i <1_000_000 ; i++) {
            v.changeValue(-10);
        }
    }
}
