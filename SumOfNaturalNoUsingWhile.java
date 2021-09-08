package com.xworkz.controlstatement;

public class SumOfNaturalNoUsingWhile {

	public static void main(String[] args) {

		int n = 20, i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum of 20 natural nos are : " + sum);

	}

}
