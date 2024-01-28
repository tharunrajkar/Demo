package com.interview;

public class PrimeNumberSingle {
	public static void main(String[] args) {
		int n = 5;

		boolean flag = false;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println(n + " is a prime");
		} else {
			System.out.println(n + " isn't prime");
		}

	}

}
