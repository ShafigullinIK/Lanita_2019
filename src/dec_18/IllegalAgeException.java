package dec_18;

public class IllegalAgeException extends RuntimeException {

    public IllegalAgeException(){
        super();
    }

    public IllegalAgeException(String s){
        super(s);
    }
}
