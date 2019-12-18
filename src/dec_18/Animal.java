package dec_18;

public abstract class Animal{
    private String name;

    public abstract void comeBack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
