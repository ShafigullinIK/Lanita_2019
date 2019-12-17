package dec_16;

public class Person {
    public String name;
    public int year;
    private int age;

    public void setAge(int a){
        if(a > 0){
            age = a;
        }
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        String result = "name = " + name +
                " year = " + year + " age = " + age;
        return result;
    }
}
