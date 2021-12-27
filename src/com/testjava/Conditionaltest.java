package com.testjava;

import java.util.Scanner;

public class Conditionaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=ob.nextInt();
		
		System.out.println("Enter value of b:");
		b=ob.nextInt();
		
		System.out.println("Enter value of c:");
		c=ob.nextInt();
		
		
		
		if(a>b && a>c)
		{
			System.out.println(a + " is a greater number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b + " is a greater number");
		}
		else
		{
			System.out.println(c + " is a greater number");
		}
		if(true)
		{
			System.out.println("hello chacha25");
		}
		

	}

}
