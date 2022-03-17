package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Conta menu=new Conta();
		Conta conta=new Conta();
		int opc;
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		System.out.println(menu);
		opc=sc.nextInt();
		do
			switch(opc) {
					case 1: 	
								if(conta.testeConta()==0) {
									System.out.print("Digite numero da conta:");
									int num=sc.nextInt();
									System.out.print("Digite titular da conta:");
									sc.next();
									String titular=sc.nextLine();
									System.out.print("Deseja realizar um depósito inicial? (s/n)");
									char resp=sc.next().charAt(0);
			        
									if(resp=='s') {
										System.out.print("Digite o valor do depósito inicial:");
										double valor=sc.nextDouble();
										conta =new Conta(num,titular,valor);
									}
			        
									else conta=new Conta(num,titular);
								}
								else
									System.out.println("Erro! Sua conta já está cadastrada");
								System.out.println(menu);
								opc=sc.nextInt();
								break;
					
					case 2: 	if(conta.testeConta()==1)
									System.out.print("Seu saldo é de "+conta.getSaldo()+"\n\n");
								else System.out.println("Você ainda não abriu sua conta");
					            System.out.println(menu);
					            opc=sc.nextInt();
					            break;
					
					case 3: 	if(conta.testeConta()==1) {
									System.out.print("Digite o valor do deposito:");
									conta.deposito(sc.nextDouble());
								}
								
								else System.out.println("Você ainda não tem conta aberta");
								System.out.println(menu);
								opc=sc.nextInt();
								break;
					case 4: 	
								if(conta.testeConta()==1) {
									System.out.print("Digite o valor do saque:");
									conta.saque(sc.nextDouble());
								}
								else System.out.println("Você ainda não abriu sua conta");
								System.out.println(menu);
								opc=sc.nextInt();
								break;
			       
		}
	
		while(opc!=5);
		
		System.out.println("Logoff efetuado com sucesso!");
		System.out.println("Programa encerrado!");
		sc.close();
	}

}
