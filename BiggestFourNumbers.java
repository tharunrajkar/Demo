package com.interview;

import java.util.Scanner;

public class BiggestFourNumbers {
	public static void main(String[] args) {
		
		int a,b,c,d;
		Scanner comp = new Scanner(System.in);
		System.out.println("Enter four Numbers Are :");
		
		a = comp.nextInt();
		b= comp.nextInt();
		c = comp.nextInt();
		d = comp.nextInt();
		
		if (a>b && a>c && a>d) {
			System.out.println("The biggest number is "+a);	
		}else if (b>a && b>c && b>d) {
			System.out.println("The biggest number is "+b);	
		}else if (c>b && c>a && c>d) {
			System.out.println("The biggest number is "+c);
			
		}else if (d>a && d>b && d>c) {
			System.out.println("The biggest number is "+d);
			
		}
		comp.close();
	}

}
