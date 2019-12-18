package dec_18;

import dec_17.Person;

public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
        if (age <= 0) {
            throw new IllegalAgeException();
        }
    }

    @Override
    public void setAge(int age){
        while (age <= 0) {
            throw new IllegalAgeException();
        }
        super.setAge(age);
    }


    @Override
    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalNameException();
        }
        super.setName(name);
    }

    public void work() throws MyException {
        System.out.println("I'm working");
        throw new MyException();
    }
}
