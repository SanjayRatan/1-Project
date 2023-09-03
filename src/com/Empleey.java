package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Empleey 
{
  public static void main(String[] args) 
   {
	  try
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter The Empleey id");
		  String eId=sc.nextLine();
		  Connection con=DriverManager.getConnection
	 ("jdbc:oracle:thin:@localhost:1521:orcl","system","abc");
		  Statement stm=con.createStatement();
		  ResultSet rs=stm.executeQuery("Select * from Empleey45 where EId='"+eId+"'");
		   if(rs.next())
		   {
			    System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"
			    +rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
		   }
		   else
		   {
			    System.out.println("Invalide Empleey id....");
		   }
		   con.close();
		   sc.close();
	  }catch(Exception e) {e.printStackTrace();}
}
}
