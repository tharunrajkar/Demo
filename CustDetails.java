package com.interview;

public class CustDetails implements Banking{

	@Override
	public void personalLoan() {
		int intrest = 8;
		
		System.out.println(intrest+"%");
		
	}

	@Override
	public void homeLoan() {
		int itr= 10;
		System.out.println(itr+"%");
		
		
	}

	@Override
	public void educationLoan() {
		int itr2=12;
		System.out.println(itr2+"%");
	}
	public static void main(String[] args) {
		CustDetails is = new CustDetails();
		is.educationLoan();
		is.personalLoan();
		is.homeLoan();
		
		
	}

}
