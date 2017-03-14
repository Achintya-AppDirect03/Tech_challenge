package com.AchintyaSrivastava.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnection {
	




	    
	    final static  String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	    final static String url="jdbc:mysql://localhost:3306/AchintyaDragonballproduct";
	    final static String host="root";
	    final static String pwd="password";
	    
	    public DbConnection()
	    {
	        
	    }

	    public static Connection getConnection() throws Exception {

	                    Class.forName(JDBC_DRIVER);
	            
	                    Connection conn=null;
	            
	                    conn= (Connection) DriverManager.getConnection(url,host,pwd);
	            
	                    return conn;
	    }
	
	
}
