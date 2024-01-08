package com.oops.flipkart;
import com.oops.flipkart.FasBrand;
import com.oops.flipkart.MobBrand;
import com.oops.flipkart.ElecBrand;
import com.oops.flipkart.Home;
import com.oops.flipkart.Appliances;
import com.oops.flipkart.Furniture;
import com.oops.flipkart.Buy;
import com.oops.flipkart.Paymentmethod;


import java.util.*;


class HomePage{
	public void homepage() {
		System.out.println("Welcome to Flipkart HomePage");
	}
	public void categories() {
		System.out.println("Select product Categories");
	}
	public void account() {
		System.out.println("Account page");
	}
	public void order(){
		System.out.println("Your Order Successfully Placed");
	}
	private void logout() {
		System.out.println("You are Successfully Loggedout from Flipkart");

	}
}
class Categories extends HomePage{
	public void mobiles(){
		System.out.println("Select Mobile Brand"+"\n"+"1.Samsung"+"\n"+"2.Xiaomi"+"\n"+"3.Vivo"+"\n"+"4.Oppo"+"\n"+"5.Moto"+"\n"+"6.Nothing"+"\n"+"7.Apple"+"\n"+"8.Realme");
		}
	public void fashion(){
		System.out.println("Select Fashion Type"+"\n"+"1.Shirts & T-Shirt"+"\n"+"2.Shoes"+"\n"+"3.Kurtas & Sarees"+"\n"+"4.Watches"+"\n"+"5.Footwear"+"\n"+"6.Luggage & Bags"+"\n"+"7.Jeans & Trouser"+"\n"+"8.Jackets "+"\n"+"9.Kidswear");
	}
	public void electronics() {
		System.out.println("Select Brand"+"\n"+"1.Samsung"+"\n"+"2.Dell"+"\n"+"3.Boat"+"\n"+"4.Lenovo"+"\n"+"5.Asus"+"\n"+"6.Philips"+"\n"+"7.Apple");
	}
	public void home() {
		System.out.println("Select Product Type"+"\n"+"1.Cookkware Range"+"\n"+"2.Blankets"+"\n"+"3.Gas Stoves"+"\n"+"4.Diy Tools"+"\n"+"5.Wallclocks");
	}
	public void appliances() {
		System.out.println("Select Product Type"+"\n"+"1.Smart TVs"+"\n"+"2.Washing Machines"+"\n"+"3.Refrigerators"+"\n"+"4.Kitchen Appliances"+"\n"+"5.Fans & Geysers"+"\n"+"6.Home Appliances");
	}
	public void furniture() {
		System.out.println("Select Furniture Type"+"\n"+"1.Bedroom"+"\n"+"2.Dining&kitchen"+"\n"+"3.Living Room"+"\n"+"4.Outdoors"+"\n"+"5.Study & Office"+"\n"+"6.Storage & Space");
	}
}

public class Mainshop {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Flipkart"+"\n"+"1.Home"+"\n"+"2.Categories"+"\n"+"3.Account");
		HomePage h=new HomePage();
		int option=sc.nextInt();
		switch (option)
		{
			case 1:
			{
//				System.out.println("Welcome to Flipkart Home Page");
//				int choice=sc.nextInt();
				h.homepage();
			}
			break;
			case 2:{
				System.out.println("Select Categories"+"\n"+"1.Mobiles"+"\n"+"2.Fashion"+"\n"+"3.Electronics"+"\n"+"4.Home"+"\n"+"5.Furniture"+"\n"+"6.Appliances");
				int categories=sc.nextInt();
				switch (categories)
				{
				case 1:MobBrand c1=new MobBrand();
				{
						c1.mobiles();

						int brand=sc.nextInt();
						if(brand==1) {
							c1.samsung();	
						}
						else if (brand==2) {
							c1.xiaomi();
						}
						else if (brand==3) {
							c1.vivo();
						}
						else if (brand==4) {
							c1.oppo();
						}
						else if (brand==5) {
							c1.motorola();
						}
						else if (brand==6) {
							c1.nothing();
						}
						else if (brand==7) {
							c1.apple();
						}
						else if (brand==8) {
							c1.realme();
						}
						else {
							System.err.println("Please Enter Valid Brand Details");
						}
				}
				break;
				case 2:FasBrand f1=new FasBrand();
				{
					f1.fashion();
					int type=sc.nextInt();
					if (type==1) {
						f1.shirt();
					}
					else if (type==2) {
						f1.kurta();
					}
					else if (type==3) {
						f1.kurta();
					}
					else if (type==4) {
						f1.watches();
					}
					else if (type==5) {
						f1.footwear();
					}
					else if (type==6) {
						f1.bags();
					}
					else if (type==7) {
						f1.jeans();
					}
					else if (type==8) {
						f1.jackets();
					}
					else if (type==9) {
						f1.kidswear();
					}
					else {
						System.err.println("Please Enter Valid Fashion Type");
					}
				}
				break;
				case 3:ElecBrand e1=new ElecBrand();
				{
					e1.electronics();
					int brand=sc.nextInt();
					if(brand==1) {
						e1.samsung();	
					}
					else if (brand==2) {
						e1.dell();
					}
					else if (brand==3) {
						e1.boat();
					}
					else if (brand==4) {
						e1.lenovo();
					}
					else if (brand==5) {
						e1.asus();
					}
					else if (brand==6) {
						e1.philips();
					}
					else if (brand==7) {
						e1.apple();
					}
					else {
						System.err.println("Please Enter Valid Brand Details");
					}
				}
				break;
				case 4:Home h1=new Home();
				{
					h1.home();
					int home=sc.nextInt();
					if (home==1) {
						h1.cookware();
					}
					if (home==2) {
						h1.blankets();
					}
					if (home==3) {
						h1.gas();
					}
					if (home==4) {
						h1.tools();
					}
					if (home==5) {
						h1.clocks();
					}
					else {
						System.err.println("Please Enter Valid Product type");
					}
					
				}
				break;
				
				case 5:Appliances a1=new Appliances();
				{
					a1.appliances();
					int app=sc.nextInt();
					if (app==1) {
						a1.tvs();
					}
					if (app==2) {
						a1.washingmachin();
					}
					if (app==3) {
						a1.fridge();
					}
					if (app==4) {
						a1.kitchen();
					}
					if (app==5) {
						a1.fans();
					}
					if (app==6) {
						a1.homeappliances();
					}
					else {
						System.err.println("Please Enter Valid Appliances Details");
					}
				}
				break;
				case 6:Furniture f=new Furniture();
				{
					f.furniture();
					int furniture=sc.nextInt();
					if (furniture==1) {
						f.bedroom();
					}
					if (furniture==2) {
						f.dining();
					}
					if (furniture==3) {
						f.livingRoom();
					}
					if (furniture==4) {
						f.outdoors();
					}
					if (furniture==5) {
						f.study();
					}
					if (furniture==6) {
						f.storage();
					}
					else {
						System.err.println("Please Enter Valid Furniture Details");
					}
				}
				break;
				default:System.err.println("Please Enter Valid Categories type");
				}
			}
			break;
			case 3:
			{
				h.account();
			}
			break;
			default:System.err.println("Please Enter Valid Input");
		}
	}
}


