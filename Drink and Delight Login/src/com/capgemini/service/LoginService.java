package com.capgemini.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.capgemini.bean.LoginBean;
import com.capgemini.dao.LoginDB;

public class LoginService {
	public int method(String username,String password)
	{

		Connection con=null;
		PreparedStatement pst=null;
	@SuppressWarnings("unused")
	LoginBean loginbean=new LoginBean();
	@SuppressWarnings("unused")
	LoginDB logindb=new LoginDB();
	try
	{
		con=LoginDB.getConnection1();
		pst=con.prepareStatement("select *from drinklogin");
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
 if(username.equals(rs.getString(1))&&password.equals(rs.getString(2)))
 {
  System.out.println("Access Granted successfully!!you are logined into the site");	
	}
		else if(username.equals(rs.getString(1)))
		{
			System.out.println("password is invalid,Recheck once again!! ");
		}
		else if(password.equals(rs.getString(2)))
		{
			System.out.println("username is invalid");
		}
else
		System.out.println("sorry you entered wrong details please enter a correct details to login into the site");
	}}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	return 0;
}
}

