package entidades;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(int num, String titular) { // construtor sem depósito inicial
		numero=num;
		this.titular=titular;	
	}
	                                 // construtor com depósito inicial
	public Conta(int num, String titular, double depositoInicial) {  
		numero=num;
		this.titular=titular;
		deposito(depositoInicial);
	}
	
	public Conta() {
		
	}
	
	public int testeConta() {
		if (numero==0)
			return 0;
		else
			return 1;
	}
	
	public void deposito(double valor) {
		saldo+=valor;
	}
	
	public void saque(double valor) {
		if(valor<=saldo)
			saldo-=valor;
		else
			System.out.println("Saldo insuficiente!");
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "********MENU DE OPCOES********\n\n"
				+ "1 - ABERTURA DE CONTA\n"
				+ "2 - VER SALDO\n"
				+ "3 - EFETUAR DEPÓSITO\n"
				+ "4 - EFETUAR SAQUE\n"
				+ "5 - SAIR\n"
				+"Escolha uma das opções acima:";
	}
	
	public String menu() {
		return "********MENU DE OPCOES********\n\n"
				+ "1 - ALTERAR DADOS DA CONTA\n"
				+ "2 - VER SALDO\n"
				+ "3 - EFETUAR DEPÓSITO\n"
				+ "4 - EFETUAR SAQUE\n"
				+ "5 - SAIR\n"
				+"Escolha uma das opções acima:";
	}
}
