package dec_17;

public class NameWithVersion {

    private String name;
    private int version;

    public NameWithVersion(String name) {
        this.name = name;
        this.version = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        version++;
    }

    public int getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "PriceWithVersion{" +
                "name=" + name +
                ", version=" + version +
                '}';
    }
}
