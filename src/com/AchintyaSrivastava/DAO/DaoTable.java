package com.AchintyaSrivastava.DAO;
import com.mysql.jdbc.Connection;

import com.mysql.jdbc.PreparedStatement;


public class DaoTable {
	

	public static  void  Creator()
	{
	try
	{
	Connection con= (Connection)DbConnection.getConnection();
    String sql= "CREATE TABLE Creator(firstName varchar(225) ,lastName varchar(200),Emailid varchar(200),AccoountIdentifier varchar(200) PRIMARY KEY not null,Userid varchar(200))";
    PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(sql);
    prpstmt.execute();

	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}
	
	
	public static void Company()
	{
	try
	{
	Connection con= (Connection)DbConnection.getConnection();
	String sql= "CREATE TABLE Company(CompanyName varchar(225) ,ComapnyEmail varchar(200),PhoneNumber varchar(200),Emailid varchar(200),AccoountIdentifier varchar(200) PRIMARY KEY not null,Userid varchar(200),Website varchar(200),Country varchar(200))";
	PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(sql);
	prpstmt.execute();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}


	public static void Order()

	{

	try

	{
	Connection con= (Connection)DbConnection.getConnection();
	String sql= "CREATE TABLE OrderProduct(EditionCode varchar(225) ,PricingDuration varchar(200),Quantity varchar(200),Unit varchar(200),AccoountIdentifier varchar(200) PRIMARY KEY not null)";
	PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(sql);
	prpstmt.execute();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}


	public static void Account()

	{

	try

	{

	Connection con= (Connection)DbConnection.getConnection();
	String sql= "CREATE TABLE Account(AccoountIdentifier varchar(200) PRIMARY KEY not null)";
	PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(sql);
	prpstmt.execute();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}

	
	
	
}
