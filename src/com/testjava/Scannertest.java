package com.testjava;

import java.util.Scanner;

public class Scannertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 Scanner ob=new Scanner(System.in);
		 Float a,b;
		 Boolean s;
		 
		 String name=null;
		 System.out.println("Enter your name");
		 name=ob.next();
		 System.out.println("pls enter boolean val");
		 s=ob.nextBoolean();
		 
		 System.out.println(name);
		 System.out.println("Enter the value of a");
         a=ob.nextFloat();
         
         System.out.println("Enter the value of b");
         b=ob.nextFloat();
         
         System.out.println("Addition="+(a+b));
         ob.close();
	}

}
