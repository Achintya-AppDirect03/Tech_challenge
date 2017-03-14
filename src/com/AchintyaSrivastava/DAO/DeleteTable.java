package com.AchintyaSrivastava.DAO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.AchintyaSrivastava.domain.UserDetails;


public class DeleteTable {
	
public static void DaoDelete_table(UserDetails ud)
		{
		
			try
			{
				Connection con = (Connection)DbConnection.getConnection();
				String query = "Delete from Creator where Userid=?";
			    PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(query);
			    System.out.println(ud.getUuid());
			    prpstmt.setString(1, ud.getUuid());
			    prpstmt.execute();
			    String query1 = "Delete from Company where Userid=?";
			    PreparedStatement prpstmt1= (PreparedStatement) con.prepareStatement(query1);
			    prpstmt1.setString(1, ud.getUuid());
			    
			    prpstmt1.executeUpdate();
			    
			    String query2 = "Delete from OrderProduct where EditionCode=?";
			    PreparedStatement prpstmt2= (PreparedStatement) con.prepareStatement(query2);
			    prpstmt2.setString(1, ud.getEditionCode());
	    
			    prpstmt2.executeUpdate();
			    
			    String query3 = "Delete from Account where AccoountIdentifier=?";
			    PreparedStatement prpstmt3= (PreparedStatement) con.prepareStatement(query3);
			    prpstmt3.setString(1, ud.getAccountIdentifier());
			    
			    prpstmt3.executeUpdate();

			    
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
}
