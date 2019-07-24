package com.Multiplication;

public class Strng2 {

	public static void main(String[] args) {
		String variable="Letmecall";
		int space=0;
		for(int i=1;i<=2;i++) {
			space=i*variable.length();
			for(int k=1;k<=space;k++)
			{
			System.out.print("");
			}
			System.out.println(variable);
			System.out.println();
			
		}
	}

}
