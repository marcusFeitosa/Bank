package entities;

public class Account {
	
	private int number; // nunca pode ser alterado
	private String holder; // pode ser alterado
	private double balance;  // só pode ser alterado mediante operações de depósito e saque
	
	public Account (int number, String holder) {  // sem depósito inicial
		this.number=number;
		this.holder=holder;
	}
	
	public Account (int number, String holder, double initialDeposit ) { // com depósito inicial
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
