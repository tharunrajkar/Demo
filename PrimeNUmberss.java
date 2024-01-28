package com.interview;

public class PrimeNUmberss {
	    public static void main(String[] args) {
	        int limit = 50; // You can change this limit as needed

	        System.out.println("Prime numbers up to " + limit + ":");
	        printPrimeNumbers(limit);
	    }

	    // Function to check if a number is prime
	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    // Function to print prime numbers up to a specified limit
	    private static void printPrimeNumbers(int limit) {
	        for (int i = 2; i <= limit; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}


