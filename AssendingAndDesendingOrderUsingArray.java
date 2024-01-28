package com.interview;

import java.util.Scanner;

public class AssendingAndDesendingOrderUsingArray {
	public static void main(String[] args) {

		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of Elements wants to compare :");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the numbers :");

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();

		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[i]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		// System.out.print("Assending Order :");
		System.out.print("Descending Order :");

		// for (int i = 0; i < n - 1; i++) {
		for (int i = n - 1; i > 0; i--) {

			System.out.print(a[i] + ",");

		}
		// System.out.println(a[n-1]);
		System.out.println(a[0]);
		s.close();
	}

}
