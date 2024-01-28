package com.interview;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n, j;
		Scanner table = new Scanner(System.in);
		System.out.println("Enter the table: ");
		n = table.nextInt();

		System.out.println("Table Upto");
		j = table.nextInt();

		for (int i = 1; i <= j; i++) {
			int c = n * i;
			System.out.println(i + " x " + n + " = " + c);

		}
		table.close();

	}

}
