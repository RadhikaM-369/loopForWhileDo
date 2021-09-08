package com.xworkz.controlstatements;

public class demoDoWhile {

	public static void main(String[] args) {
		int x=15,sum=0;
		
		do {
			sum=sum+x;
			x--;
		} while (x>10);
			System.out.println("Sum = "+ sum);

	}

}
