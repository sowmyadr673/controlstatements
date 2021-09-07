package com.xworkz.controlstatement;

public class RoadTaxInformation {

	public static void main(String[] args) {

		int Price = 50000;
		double taxAmount;
		String states = "TN";
		if (states == "KA") {
			taxAmount = Price * 0.12 / 100;
			System.out.println("tax Amount for karnataka " + taxAmount);
		} else if (states == "AP") {
			taxAmount = Price * 0.8 / 100;
			System.out.println("tax amount for andrapradesh " + taxAmount);
		} else if (states == "TN") {
			taxAmount = Price * 0.13 / 100;
			System.out.println("tax amount for tamil nadu " + taxAmount);
		} else if (states == "TS") {
			taxAmount = Price * 0.7 / 100;
			System.out.println("tax amount for telangana" + taxAmount);
		}

	}

}
