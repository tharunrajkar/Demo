package com.interview;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

	// Intialize variables

		int n = 0;
		int a = 0;
		int i = 0;
		int j = 0;

	// To get value from the User

		Scanner prime = new Scanner(System.in);
		System.out.println("Enter a number : ");

		n = prime.nextInt();
		a = n;

	// Palindrome Number checking LOGIC

		while (a > 0) {

			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;

		}

	// Condition Checking

		if (n == j) {
			System.out.println("Its palindrome Number");
		} else {
			System.out.println("Its not Palindrome Number");
		}

		prime.close();
	}

}
