package Day14Assignment.question1;

public class Account {
	int amount;
	String accountNumberString;

	public Account(String accountnumber) {
		this.accountNumberString = accountnumber;
	}

	public void deposite(int amount) {
		this.amount = amount;
	}

	public double withdraw(int amount) throws InsufficientFundsException {
		if(amount<=this.amount) {
			this.amount=this.amount-amount;
			System.out.println("Amount has been withdrawn "+amount);
			System.out.println("Remaing amount is "+this.amount);
		}else {
			InsufficientFundsException insufficientFundsException=new InsufficientFundsException();
			throw insufficientFundsException;
		}
		return 0;
	}

}
