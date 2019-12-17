package dec_17;

public class PriceWithVersion {
    private int price;
    private int version;

    public PriceWithVersion(int price) {
        this.price = price;
        this.version = 1;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        version++;
    }

    public int getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "PriceWithVersion{" +
                "price=" + price +
                ", version=" + version +
                '}';
    }
}
