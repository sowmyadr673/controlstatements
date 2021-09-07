package com.xworkz.controlstatement;

public class IphonePrices {

	public static void main(String[] args) {

		String model = "iphone 6 plus";
		if (model == "iphone") {
			System.out.println("price of" + model + " is : 59000 Rs");
		} else if (model == "iphone 6 plus") {
			System.out.println("price of" + model + " is : 750000 Rs");
		} else if (model == "iphone 11") {
			System.out.println("price of" + model + " is : 120000 Rs");
		} else if (model == "iphone 12 pro ") {
			System.out.println("price of" + model + " is :150000 Rs");
		} else {
			System.out.println("Invalid model name");
		}
	}

}
