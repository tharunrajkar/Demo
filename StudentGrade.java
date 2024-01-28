package com.interview;

import java.util.*;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner student = new Scanner(System.in);

		System.out.println("Enter Marks : ");
		int n = student.nextInt();
		if (100 >= n && n >= 90) {
			System.out.println("S grade ");

		} else if (89 >= n && n >= 80) {
			System.out.println("A grade ");

		} else if (79 >= n && n >= 70) {
			System.out.println("B grade ");

		} else if (69 >= n && n >= 60) {
			System.out.println("C grade");

		} else if (59 >= n && n >= 55) {
			System.out.println("D grade");

		} else if (54 >= n && n >= 50) {
			System.out.println("E grade");
		} else if (50 >= n) {
			System.out.println("Fail");

		}
		student.close();

	}

}
