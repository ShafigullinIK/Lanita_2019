package dec_17;

public class Tester extends Person {

    private int exp;

    public Tester(String name, int age, int exp){
        super(name, age);
        this.exp = exp;
    }

//    @Override
//    public void printInfo(){
//        super.printInfo();
//        System.out.println("exp = " + exp);
//    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("exp = " + exp);
    }
}
