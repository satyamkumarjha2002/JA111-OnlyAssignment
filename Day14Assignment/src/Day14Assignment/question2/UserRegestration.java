package Day14Assignment.question2;
import java.util.Scanner;

public class UserRegestration {
	void userRegister(String name, String userCountry) throws InvalidCountryException {
	if(userCountry.equalsIgnoreCase("india")) {
		System.out.println("User registration done");
	}else {
		InvalidCountryException invalidCountryException=new InvalidCountryException();
		throw invalidCountryException;
		
	}
}
	public static void main(String[] args) {
	   UserRegestration userRegestration=new UserRegestration();
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter User Name");
	   String nameString=scanner.next();
	  System.out.println("Enter country Name");
	   String countryString=scanner.next();
	   try {
		userRegestration.userRegister(nameString,countryString);
	} catch (InvalidCountryException e) {
		System.out.println(e.getMessage());
	}
    	System.out.println("Normal Termination");   
	}

}
