package com.user.registerationpkg;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {
	static Scanner sc= new Scanner(System.in);
	
	public static void matches(String reg1) {
		Pattern p1 = Pattern.compile(reg1);
//		Matcher m1 = p1.matcher(firstName);
//		
//		Matcher m1 = p1.matcher(firstName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n*****Welocme To User Registeration*****");
		
		System.out.println("\nEnter your First Name : ");
		String firstName=sc.next(); 
		System.out.println("\nEnter your Last Name : ");
		String lastName=sc.next(); 
		//To check if name starts with Capital and has min 3 characters.
		String reg1="[A-Z]{1}[a-z]{3,}";
		Pattern p1 = Pattern.compile(reg1);
		Matcher m1 = p1.matcher(firstName);
		Matcher m2 = p1.matcher(lastName);
		boolean m=m1.matches();
		boolean m3=m2.matches();
		System.out.println("First Name:"+m);
		System.out.println("Last Name:"+m3);
	}
}
