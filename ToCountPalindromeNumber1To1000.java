package com.interview;

public class ToCountPalindromeNumber1To1000 {

	public static void main(String[] args) {
		int c = 0;
		for (int n = 0; n < 1000; n++) {
			int a, i = 0, j = 0;
			a = n;
			while (a > 0) {
				i = a % 10;
				j = (j * 10) + i;
				a = a / 10;
			}
			if (n == j) {
				c++;
			}
		}
		System.out.println(c);

	}

}
