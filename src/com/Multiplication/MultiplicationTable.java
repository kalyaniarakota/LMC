package com.Multiplication;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int value;
		for(int i=2;i<=3;i++)
		{
			for(int j=1;j<=10;j++)
			{ 
				value=j*i;
				System.out.println(i + "*" + j + "="+ value);
				
			}
			if(i==3) {
				continue;
				}
		}
		
	}

}
