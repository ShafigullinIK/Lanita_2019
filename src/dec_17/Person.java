package dec_17;

public class Person {

    private String name;
    private int age;

    private final int DEFAULT_AGE = 18;

    public Person(String name, int age) {
        System.out.println("Person created");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < DEFAULT_AGE){
            this.age = DEFAULT_AGE;
        } else{
            this.age = age;
        }
    }

    public void printInfo(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
