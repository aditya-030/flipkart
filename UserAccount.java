package com.oops.flipkart;

import java.util.Scanner;

class Account{
	long accno;
	String ifsc;
	double bal;
	public Account(long accno,String ifsc) {
		this.accno=accno;
		this.ifsc=ifsc;
	}
	public void deposit(double amt) {
		if (amt>=0) {
			bal=bal+amt;
			System.out.println("Deposit Amount : "+amt+" , "+"Current bal : "+bal);
		}
		else {
			System.err.println("Plese enter valid amount");
		}
	}
	public void withdraw(double amt) {
		if (amt>=0 && bal>=amt) {
			bal=bal-amt;
			System.out.println("Withdraw amt : "+amt +" , "+ "Current bal : "+bal);
		}
		else {
			System.err.println("Insufficent Bal");
		}
	}
	
}
class Customer{
	String name;
	long phone;
	Account a1;
	public Customer(String name,long phone,Account a1){
		this.name=name;
		this.phone=phone;
		this.a1=a1;
	}
	public void deposittoAccount(double amt) {
		a1.deposit(amt);
	}
	public void withdrawfromAccount(double amt) {
		a1.withdraw(amt);
	}
	public void CustomerDetails() {
		System.out.println("Name : "+ name+"\n" +"phone : "+phone);
		System.out.println("Account no. : "+a1.accno + "\n"+"Ifsc Code : "+a1.ifsc);
	}
}

public class UserAccount {
	public static void main(String[] args) {
		Account a1=new Account(789456123l, "SBIN0054");
		Customer c1=new Customer("abhi", 789458210378l, a1);
		c1.CustomerDetails();
//		Scanner sc=new Scanner(System.in);
//		int deposit=new sc.nextInt();
		c1.deposittoAccount(99900);
//		c1.withdrawfromAccount(1111);
	}
}
