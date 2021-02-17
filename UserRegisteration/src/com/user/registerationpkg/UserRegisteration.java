package com.user.registerationpkg;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegisteration {
	static Scanner sc= new Scanner(System.in);
	
	public static void validation(String firstName,String lastName) {
		//To check if name starts with Capital and has min 3 characters.
		System.out.println("Name: "+Pattern.matches("[A-Z]{1}[a-z]{3,}",firstName));
		System.out.println("LastName: "+Pattern.matches("[A-Z]{1}[a-z]{3,}",lastName));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n*****Welocme To User Registeration*****");
		System.out.println("\nEnter your First Name : ");
		String firstName=sc.next(); 
		System.out.println("\nEnter your Last Name : ");
		String lastName=sc.next(); 
		
		//Method to validate input data.
		validation(firstName,lastName);
	}
}

