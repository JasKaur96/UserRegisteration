package com.user.registerationpkg;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n*****Welocme To User Registeration*****");
		
		System.out.println("\nEnter your name : ");
		String firstName=sc.next(); 
		
		//To check if name starts with Capital and has min 3 characters.
		String reg1="[A-Z]{1}[a-z]{3,}";
		Pattern p1 = Pattern.compile(reg1);
		Matcher m = p1.matcher(firstName);
		boolean m1=m.matches();
		System.out.println(m1);
	}
}
