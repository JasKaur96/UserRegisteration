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
		
		String reg="[A-Z]{1}[a-z]{3,}";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(firstName);
		boolean m1=m.matches();
		System.out.println(m1);
	}
}
