package com.AchintyaSrivastava.DAO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.AchintyaSrivastava.domain.UserDetails;

public class DaoInsertTable {

		public static void Insert(UserDetails ud)
		{
			
			try
			{
				Connection con = (Connection)DbConnection.getConnection();
				String query = "Insert into Creator(firstName ,lastName, Emailid, AccoountIdentifier, Userid )"+"values(?,?,?,?,?)";
			    PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(query);
			    prpstmt.setString(1, ud.getFirstName());
			    prpstmt.setString(2, ud.getLastName());
			    //prpstmt.setString(, ud.getAddress());
			    prpstmt.setString(3, ud.getEmail());
			    prpstmt.setString(4, ud.getAccountIdentifier());
			    prpstmt.setString(5, ud.getUuid());
			    //prpstmt.setString(7, ud.getLanguage());
			    
			    prpstmt.executeUpdate();
			    
			    String query1 = "Insert into Company(CompanyName,PhoneNumber, Emailid, AccoountIdentifier, Userid , Website, Country)"+"values(?,?,?,?,?,?,?)";
			    PreparedStatement prpstmt1 = (PreparedStatement) con.prepareStatement(query1);
			    prpstmt1.setString(1, ud.getCompanyName());
			   // prpstmt1.setString(2, ud.getCompanyemail());
			    prpstmt1.setString(2, ud.getCompanyPhnNumber());
			    prpstmt1.setString(3, ud.getEmail());
			    prpstmt1.setString(4, ud.getAccountIdentifier());
			    prpstmt1.setString(5, ud.getUuid());
			    prpstmt1.setString(6, ud.getCompanyWebsite());
			    prpstmt1.setString(7, ud.getCompanyCountry());
			    
			    prpstmt1.executeUpdate();
			    
			    String query2 = "Insert into OrderProduct(EditionCode ,PricingDuration , AccoountIdentifier)"+"values(?,?,?)";
			    PreparedStatement prpstmt2 = (PreparedStatement) con.prepareStatement(query2);
			    prpstmt2.setString(1, ud.getEditionCode());
			    prpstmt2.setString(2, ud.getPricingDuraciton());
			    prpstmt2.setString(3, ud.getAccountIdentifier());
			   
			    prpstmt2.executeUpdate();
			    
			    String query3 = "Insert into Account(AccoountIdentifier)"+"values(?)";
			    PreparedStatement prpstmt3 = (PreparedStatement) con.prepareStatement(query3);
			    prpstmt3.setString(1, ud.getAccountIdentifier());
			   
			    prpstmt3.executeUpdate();
			    
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	
}
