package com.xworkz.controlstatement;

public class CarDetails {

	public static void main(String[] args) {

		String CompanyName = "Swift";
		switch (CompanyName) {
		case "Toyota":
			System.out.println("Engine Capacity : 1200 - 1300 cc");
			System.out.println("Milage : 20 - 22 KMPL");
			System.out.println("Price :10 Lakh");

			break;
		case "Swift":
			System.out.println("Engine Capacity : 700 - 1097 cc");
			System.out.println("Milage : 22 - 24.6 KMPL");
			System.out.println("Price :9 Lakh");
			break;
		case "Crysta":
			System.out.println("Engine Capacity : 850- 1320 cc");
			System.out.println("Milage : 15.6 - 19.8");
			System.out.println("Price :15 Lakh");
			break;
		case "Maruthi":
			System.out.println("Engine Capacity : 1000 - 1800 cc");
			System.out.println("Milage : 15 - 17");
			System.out.println("Price :8 Lakh");
			break;
		default:
			System.out.println("Invalid Car name");

		}
	}

}
