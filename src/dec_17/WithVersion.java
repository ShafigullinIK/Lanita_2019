package dec_17;

public class WithVersion<T> {
//public class WithVersion<T extends Person> { // - эта версия нужна, если можно использовать только наследников классаPerson

    private T value;
    private int version;

    public WithVersion(T value){
        this.value = value;
        version = 1;
    }

    public T getValue() {
        return value;
    }

    public int getVersion() {
        return version;
    }

    public void setValue(T value) {
        this.value = value;
        version++;
    }

    @Override
    public String toString() {
        return "WithVersion{" +
                "value=" + value +
                ", version=" + version +
                '}';
    }
}
