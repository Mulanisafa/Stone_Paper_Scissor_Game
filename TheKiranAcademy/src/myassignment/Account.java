package myassignment;

class InsufficientFundException extends Exception {
	public InsufficientFundsException(String message) {
		 super(message);
	 }

}

 class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;

	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("deposited" + amount);

	}

//	public void withdraw(double amount)throws InsuffcientFundException {
//		if(amount>balance) {
//			throws new InsuffcientFundException("not enough balance");
//		}
//		balance -= amount;
//		System.out.println("withdraw"+amount);
//		
//	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance");
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount);
    }

	public void displaybalance() {
		System.out.println("balance" + balance);
	}

}
public class bank{
	public static void main(String[] args) {
		Account acc = new Account(500);
		acc.displaybalance();
		acc.deposit(100);
		acc.displaybalance();
		try {
			acc.withdraw(500);
		}catch(InsuffcientFundsException e) {
			System.out.println("error"+e.getMessage());
		}
		acc.displaybalance();
	}
}








