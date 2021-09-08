package com.xworkz.controlstatement;

public class SumOfNaturalNoUsingDoWhile {

	public static void main(String[] args) {

		int n = 15, i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= n);
		System.out.println("sum of 30 natural nos are : " + sum);

	}

}
