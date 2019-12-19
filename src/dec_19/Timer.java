package dec_19;

public class Timer extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            try {
                Vault v = new Vault();
                AddVault a = new AddVault(v);
                Thread.sleep(0);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println("остановили поток");
                break;
            }
        }
    }
}
