package com.user.registerationpkg;


import java.util.Scanner;
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
		System.out.println("\nEnter your Email : ");
		String email=sc.next(); 
		
		//To check if name starts with Capital and has min 3 characters.
		System.out.println("Name: "+Pattern.matches("[A-Z]{1}[a-z]{3,}",firstName));
		System.out.println("LastName: "+Pattern.matches("[A-Z]{1}[a-z]{3,}",lastName));
	}
}
