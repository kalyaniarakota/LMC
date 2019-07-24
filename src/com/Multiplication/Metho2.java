package com.Multiplication;

public class Metho2 {

	public static void main(String[] args) {

	int n=11;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The given number is prime number ");
		}
		else
		{
			System.out.println("its not aprime Number");

		}
		
		
		
	}

}
