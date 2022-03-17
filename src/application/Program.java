package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Double balance, withdrawLimt;
		String holder;
		Integer number;
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		number=sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		holder=sc.nextLine();
		System.out.print("Initial balance: ");
		balance=sc.nextDouble();
		System.out.print("Withdraw limit: ");
		withdrawLimt=sc.nextDouble();
		
		Account account=new Account(number, holder, balance, withdrawLimt);
		
		try {
			System.out.print("Enter amount for withdraw:");
			double withdraw=sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println("New balance: "+account.getBalance());
		}
		catch(RuntimeException e) {
			System.out.print(e.getMessage());
		}
		
		
		
		sc.close();
		
	}
}


