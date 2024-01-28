 package com.interview;

public class PrimeNumbers {
	public static void main(String[] args) {
		int c = 0;
		System.out.println("List of Prime Numbers");
		for (int n = 1; n <100; n++) {
			int count = 0;
			for (int i = 2; i < n ; i++) {
				if (n % i == 0) {
					count = 1;
				}

			}
			if (count == 0) {
				System.out.println(n + ",");
				c++;

			}

		}
		System.out.println("\n count of prime numbers =" + c);

	}

}
