package Constructor;

public class BankAccount {
	private String AccountNumber;
	private double balance;
	
	public BankAccount(String AccountNumber,double balance) {
		setAccountNumber(AccountNumber);
		setbalance(balance);
		
	}
	public void setAccountNumber(String AccountNumber) {
		if(AccountNumber != null && !AccountNumber.isEmpty())
			this.AccountNumber = AccountNumber;
		else
			System.out.println("name cannot be empty or null");
	}
	public void deposit(double amount) {
		
		if(balance>0) {
			balance += amount;
		    this.balance = balance;
		    System.out.println("deposited"+amount);
		}else {
			System.out.println("deposit more amount");
		}
		
	}
    public void withdraw(double amount) {
		
		if(amount>0) {
			balance -= amount;
		    this.balance = balance;
		    System.out.println("withdraw"+amount);
		}
		    else if(amount>balance) {
		    	System.out.println("insufficient balance");
		    	
		    }else {
		    	System.out.println("withdraw amount");
		    }
		    	
		
	}
    public void setbalance(double balance) {
    	System.out.println("current balance"+balance);
    }
		
		
	
	

	

}
