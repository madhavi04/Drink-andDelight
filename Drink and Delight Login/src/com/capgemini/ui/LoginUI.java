package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.service.LoginService;


public class LoginUI {
	public static void main(String[] args) {
		 String username;
		 String password;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a username");
		username=sc.next();
		System.out.println("enter a password");
		password=sc.next();
		LoginService ls=new LoginService();
	
		ls.method(username, password);
	}
}
