package com.oops.flipkart;

import java.util.Scanner;

class Paymentmethod extends Categories {
	public void cod() {
		System.out.println("you are selected cash on delivery payment methods");
		order();
	}
	public void upi() {
		System.out.println("you are selected UPI payment methods");
		System.out.println("yo have sucessfully done the payment");
		order();
	}
	public void cards() {
		System.out.println("you are selected Credit/debit Card payment methods");
		System.out.println("yo have sucessfully done the payment");
		order();
	}
}

public class Buy extends Paymentmethod{
	public void order(){
		System.out.println("Your Order Successfully Placed");
	}
	public void section() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select "+"\n"+"1.Buy"+"\n"+"2.Add to Cart"+"\n"+"3.Wishlist");
		int option=scanner.nextInt();
		switch (option)
		{
			case 1:
			{
				buy();
			}
		}
	}
	public void buy() {
		address();
	}
	public void address() {
		System.out.println("Please enter your address");
		Scanner scanner=new Scanner(System.in);
		String ad=scanner.nextLine();
		payment();
	}
	public void payment() {
		System.out.println("Select your payment method"+"\n"+"1.COD"+"\n"+"2.UPI"+"\n"+"3.Debit/Credit Card");
		Scanner scanner=new Scanner(System.in);
		int pay=scanner.nextInt();
		if (pay==1) {
			cod();
		}
		else if (pay==2) {
			upi();
		}
		else if (pay==3) {
			cards();
		}
		else {
			System.err.println("Plese enter valid payment method");
		}

	}
}

