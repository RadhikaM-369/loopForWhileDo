package com.xworkz.controlstatements;

public class demoWhile {

	public static void main(String[] args) {
		int x=1, sum=0;
		
		while(x<=10)
		{
			sum=sum+x;
			x++;
		}
		
		System.out.println("sum of numbers :"+sum);
	}

}
