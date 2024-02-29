package com.neo.com.review01;

import java.util.Scanner;

public class homeWork01 {

	public static void main(String[] args) {
		
	
	
	Scanner moe = new Scanner (System.in);
	
	System.out.println("please enter the first number ");
	double d1  = moe .nextDouble();
	
	System.out.println("please enter the scond number ");
	double d2 = moe.nextDouble();

	System.out.println(d1 + " " + d2 );		
	
	System.out.println("please enter the operator (+, -, *, /,");
	
	String operator = moe.next();
	double result = 0;
	
	if (operator .equals(" + "))
	    result = d1 + d2 ;
	
	
	
	
	if ( operator .equals( "+")){
	
		System.out.println("the result is ->" +( d1 +d2));
	}
	else if (operator.equals ("-" )) {
		System.out.println("the result is -> "  + (d1-d2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

}
