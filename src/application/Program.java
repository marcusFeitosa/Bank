package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc=new Scanner(System.in);
	
	String holder;
	int number;
	double amount;
	Account c;
	
	System.out.printf("Enter account number: ");
	number=sc.nextInt();
	System.out.printf("Enter account holder: ");
	sc.nextLine();
	holder=sc.nextLine();
	System.out.printf("Is there a initial deposit? (y/n)");
	char resp=sc.next().charAt(0);
	if(resp=='y') {
		System.out.print("Enter initial deposit value: ");
		amount=sc.nextDouble();
		c=new Account(number,holder,amount);
		}
	else {
	    c= new Account(number,holder);
	}
	
	System.out.println("Account data:");
	System.out.println(c);
	
	System.out.println();
	System.out.print("Enter a deposit value:");
	amount=sc.nextDouble();
	c.deposit(amount);
	
	System.out.println("Updated account data:");
	System.out.println(c);
	
	System.out.print("Enter a withdraw value:");
	amount=sc.nextDouble();
	c.withdraw(amount);
	
	System.out.println("Updated account data:");
	System.out.println(c);
	
	
	sc.close();	
    }
}
