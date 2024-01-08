package com.oops.flipkart;

import java.util.Scanner;
class MobBrand extends Categories{
//	Buy b1;
//	public MobBrand(Buy b1)
//	{
//		this.b1=b1;
//	}
	Buy buy = new Buy();
	public void samsung() {
		
		System.out.println("Select/Choose Mobile Model"+"\n"+"1.Samsung F14 , "+"2.Samsung S23 , "+"3.Samsung S21 , "+"4.Samsung S22 , "+"5.Samsung S21 FE , "+"6.Samsung A14 , "+"7.Samsung A23 , "+"8.Samsung A54");
		String [] models={"Samsung F14","Samsung S23","Samsung S21","Samsung S22","Samsung S21 FE","Samsung A14","Samsung A23","Samsung A54"};
		Scanner scanner=new Scanner(System.in);
		int model=scanner.nextInt();
		for (int i = 0; i <=models.length-1; i++) {
			if (model==i+1) {
				System.out.println("You choose"+" "+models[i]);
//				Buy buy = new Buy();
//				b1.section();
				buy.section();
				

			}
		}
	}
	public void xiaomi() {
		System.out.println("Select/Choose Mobile Model"+"\n"+"1.Redmi Note 12 Pro , "+"2.Redmi 12 5g , "+"3.Redmi 12 , "+"4.Redmi note 12 , "+"5.Redmi 12c , "+"6.Redmi 11 , "+"7.Redmi A2");
		String [] models= {"1.Redmi Note 12 pro","2.Redmi 12 5g","3.Redmi 12","4.Redmi note 12","5.Redmi 12c","6.Redmi 11","7.Redmi A2"};
		Scanner scanner=new Scanner(System.in);
		int model=scanner.nextInt();
		for (int i = 0; i <=models.length-1; i++) {
			if (model==i+1) {
				System.out.println("You choose"+" "+models[i]);
				buy.section();
//				b1.section();
			}
		}
	}
	public void vivo() {
		String [] models= {"1.Vivo T2x","2.Vivo T2 pro","3.Vivo V27","4.Vivo Y200 5g","5.Vivo v29","6.Vivo X80","7.Vivo V29"};
		System.out.println("Select/Choose Mobile Model"+"\n"+"1.Vivo T2x , "+"2.Vivo T2 pro , "+"3.Vivo V27 , "+"4.Vivo Y200 5g , "+"5.Vivo V29 , "+"6.Vivo X80 , "+"7.Vivo V29");
		Scanner scanner=new Scanner(System.in);
		int model=scanner.nextInt();
		for (int i = 0; i <=models.length-1; i++) {
			if (model==i+1) {
				System.out.println("You choose"+" "+models[i]);
				buy.section();
//				b1.section();
			}
		}
	}
	public void oppo() {
		String [] models= {"1.Oppo F21s","2.Oppo Reno10 pro","3.Oppo A17k","4.Oppo A17","5.Oppo A14"};
		System.out.println("Select/Choose Mobile Model"+"\n"+"1.Oppo F21s , "+"2.Oppo Reno10 pro , "+"3.Oppo A17k , "+"4.Oppo A17 , "+"5.Oppo A57");
		Scanner scanner=new Scanner(System.in);
		int model=scanner.nextInt();
		for (int i = 0; i <=models.length-1; i++) {
			if (model==i+1) {
				System.out.println("You choose"+" "+models[i]);
				buy.section();
//				b1.section();
			}
		}
	}
	public void motorola() {
		String [] models= {"1.Moto Edge 40 Neo","2.Moto G54","3.Moto G14","4.Moto G84 5g","5.Moto Edge30"};
		System.out.println("Select/Choose Mobile Model"+"\n"+"1.Moto Edge 40 Neo , "+"2.Moto G54, "+"3.Moto G14 , "+"4.Moto G84 5g , "+"5.Moto Edge30");
		Scanner scanner=new Scanner(System.in);
		int model=scanner.nextInt();
		for (int i = 0; i <=models.length-1; i++) {
			if (model==i+1) {
				System.out.println("You choose"+" "+models[i]);
				buy.section();
//				b1.section();
			}
		}
	}
	public void nothing() {
		String [] models= {"1.Nothing 1 5g","2.Nothing Phone 2 5g"};
		System.out.println("Select/Choose Mobile Model"+"\n"+"1.Nothing Phone 1 5g , "+"2.Nothing Phone 2 5g, ");
		Scanner scanner=new Scanner(System.in);
		int model=scanner.nextInt();
		for (int i = 0; i <=models.length-1; i++) {
			if (model==i+1) {
				System.out.println("You choose"+" "+models[i]);
				buy.section();
//				b1.section();
			}
		}
	}
	public void apple() {
		String [] models= {"1.Apple iPhone 15 Pro 5g","2.Apple iPhone 15","3.Apple iPhone 14 Mini","4.Apple iPhone 14","5.Apple iPhone 14 pro 5g"};
		System.out.println("Select/Choose Mobile Model"+"\n"+"1.Apple iPhone 15 Pro 5g , "+"2.Apple iPhone 15, "+"3.Apple iPhone 14 Mini , "+"4.Apple iPhone 14 , "+"5.Apple iPhone 14 pro 5g");
		Scanner scanner=new Scanner(System.in);
		int model=scanner.nextInt();
		for (int i = 0; i <=models.length-1; i++) {
			if (model==i+1) {
				System.out.println("You choose"+" "+models[i]);
				buy.section();
//				b1.section();
			}
		}
	}
	public void realme() {
		String [] models= {"1.Realme 11 Pro+ 5g","2.Realme 11 Pro 5g","3.Realme 11 5g","4.Realme 11x 5g","5.Realme C51"};
		System.out.println("Select/Choose Mobile Model"+"\n"+"1.Realme 11 Pro+ 5g , "+"2.Realme 11 Pro 5g, "+"3.Realme 11 5g , "+"4.Realme 11x 5g , "+"5.Realme C51");
		Scanner scanner=new Scanner(System.in);
		int model=scanner.nextInt();
		for (int i = 0; i <=models.length-1; i++) {
			if (model==i+1) {
				System.out.println("You choose"+" "+models[i]);
				buy.section();
//				b1.section();
			}
		}
	}
}
