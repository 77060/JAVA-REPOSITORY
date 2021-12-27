package com.testjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamicinitilation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		
   BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

   int a,b;
   System.out.println("enter the value of a:");
   a=Integer.parseInt(ob.readLine());
   
   System.out.println("enter the value of b:");
   b=Integer.parseInt(ob.readLine());

   System.out.println("sum="+(a+b));
}}
