package practice;

public class Account {
	
	private int balance = 10000;
	
	public void withdraw(int amount){
		balance -=amount;		
	}
	
	public void deposit(int amount){
		balance += amount;
	}
	
	public int getBalance(){
		return balance;
	}
		
	
	public void transfer(Account acc1, Account acc2, int amount){
		acc1.withdraw(amount);
		acc2.deposit(amount);
	}

}
