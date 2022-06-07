package Day14Assignment.question2;

public class InvalidCountryException extends Throwable {
    InvalidCountryException(){
    	super("User outisde form the India cannot be registered");
    }
}
