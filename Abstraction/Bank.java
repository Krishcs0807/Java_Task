package Abstraction;

import java.util.Scanner;

public class Bank {
	Scanner sc=new Scanner(System.in);
	void SBI() {
		Scanner sc=new Scanner(System.in);
		Abstract_subclass Sbi_bank=new Abstract_subclass();
		Sbi_bank.intrest(10);
		System.out.println("Loan Amout");
		int amount=sc.nextInt();
		System.out.println("how many years pay loan amount Ex:1 or 2;year");
		int year=sc.nextInt();
		Sbi_bank.rate_colculate(amount, year);
	}
	
	void IND() {
		Abstract_subclass Ind_bank=new Abstract_subclass();
		Ind_bank.intrest(5);
		System.out.println("Loan Amout");
		int amount=sc.nextInt();
		System.out.println("how many years pay loan amount Ex:1 or 2;year");
		int year=sc.nextInt();
		Ind_bank.rate_colculate(amount, year);

	}
    void Canera() {
		Abstract_subclass Canera_bank=new Abstract_subclass();
		Canera_bank.intrest(8);
		System.out.println("Loan Amout");
		int amount=sc.nextInt();
		System.out.println("how many years pay loan amount Ex:1 or 2;year");
		int year=sc.nextInt();
		Canera_bank.rate_colculate(amount, year);
    }
    void ICIC() {
    	Abstract_subclass IcIc_bank=new Abstract_subclass();
		IcIc_bank.intrest(15);
		System.out.println("Loan Amout");
		int amount=sc.nextInt();
		System.out.println("how many years pay loan amount Ex:1 or 2;year");
		int year=sc.nextInt();
		IcIc_bank.rate_colculate(amount, year);
    }
}
