package dec_19;

public class MaxSearcher implements Runnable {

    int[] array;
    int start;
    int end;
    int max;

    public MaxSearcher(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
        max = Main.max(array, start, end);
    }
}
