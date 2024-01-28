package com.interview;

import java.util.Scanner;

public class ToFindEvenOrOdd {
	public static void main(String[] args) {

		try (Scanner e = new Scanner(System.in)) {
			System.out.println("Enter number");
			int n = e.nextInt();

			if (n % 2 == 0) {
				System.out.println("Its a even");

			} else {
				System.out.println("Its not even");
			}
		}
	}

}
