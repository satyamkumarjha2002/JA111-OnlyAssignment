package Day14Assignment.question1;
public class AccountDemo {

	public static void main(String[] args) {
		Account account=new Account("123456789");
		account.deposite(10000);
		try {
			account.withdraw(50000);
		} catch(Throwable e) {
			System.out.println(e.getMessage());
		  
		}
		System.out.println("Normal temination");
		
	}

}
