package com.railworld;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bank b1 = new SBI();
			System.out.println(b1.getRateOfInterest());
			
			Bank b2 = new ICICI();
			System.out.println(b2.getRateOfInterest());
			
			Bank b3 = new PNB();
			System.out.println(b3.getRateOfInterest());
	}

}
