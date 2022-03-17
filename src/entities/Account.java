package entities;

public class Account {
	
	private int number; // nunca pode ser alterado
	private String holder; // pode ser alterado
	private double balance;  // s� pode ser alterado mediante opera��es de dep�sito e saque
	
	public Account (int number, String holder) {  // sem dep�sito inicial
		this.number=number;
		this.holder=holder;
	}
	
	public Account (int number, String holder, double initialDeposit ) { // com dep�sito inicial
		this.number=number;
		this.holder=holder;
		deposit(initialDeposit);
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		balance-=amount +5.0;
	}
	
	
	public String toString() {
		return "Account "
				+ number +
				", Holder: "+
				holder+
				", Balance: "+
				balance;
	}
	
	
	
	
	
}
