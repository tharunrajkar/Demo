package com.interview;

import java.util.Scanner;

public class SwappingNumbersUsingThirdVariable {
	public static void main(String[] args) {
		int a,b,c;
		try (Scanner sw = new Scanner(System.in)) {
			System.out.println("enter the numbers");
			
			a=sw.nextInt();
			b= sw.nextInt();
		}
		c=a;
		a=b;
		b=c;
		System.out.println("Swapping numbers are");
		System.out.println(a);
		System.out.println(b);
	}

}
