package exp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.sqlite.SQLiteDataSource;

public class DB {
	



	    public Connection connect() {
	        Connection conn = null;
	        try {
	          
	            String url = "jdbc:sqlite:C:\\Users\\Smile\\Desktop\\j\\29th_Nov\\Mobile.db";
	        
	            conn = DriverManager.getConnection(url);
	            
	            System.out.println("Connection to SQLite has been established.");
	           // ResultSet rs=conn.createStatement().executeQuery("SELECT * FROM Mobile");
	    	//	while(rs.next()) {
	    		//	System.out.println(rs.getString("id"));
	    	//	}
	          String create="CREATE TABLE \"mobile\" (\r\n"
	          		+ "	\"id\"	INTEGER,\r\n"
	          		+ "	\"model\"	TEXT,\r\n"
	          		+ "	\"brand\"	TEXT,\r\n"
	          		+ "	\"price\"	INTEGER\r\n"
	          		+ ")";
	            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                System.out.println(ex.getMessage());
	            }
	        }
			return conn;
	    }
	  
	     

	        public void insert(Integer id, String  model,String  brand,Integer price) {
	            String sql = "INSERT INTO mobile(id, model, brand, price) VALUES(?,?,?,?)";

	            try (Connection conn = this.connect();
	                    PreparedStatement pstmt = conn.prepareStatement(sql)) {
	                pstmt.setInt(1, id);
	                pstmt.setString(2, model);
	                pstmt.setString(3, brand);
	                pstmt.setInt(4, price);
	                pstmt.executeUpdate();
	            } catch (SQLException e) {
	                System.out.println(e.getMessage());
	            }
	        }

	       
	      

	    }
	    
	

