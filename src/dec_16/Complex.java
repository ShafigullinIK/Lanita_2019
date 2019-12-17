package dec_16;

public class Complex {

    int re;
    int im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public void sum(Complex a){
        this.re += a.re;
        this.im = this.im + a.im;
    }

    public static Complex sum(Complex a, Complex b){
        Complex result = new Complex(a.re+b.re,
                a.im + b.im);
        return result;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}
