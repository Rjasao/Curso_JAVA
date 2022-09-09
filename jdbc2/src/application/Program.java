package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

    	public static void main(String[] args) {
			
    		Connection conn = null; // conexao
    		Statement st = null; //consulta
			ResultSet rs = null; //quarda consulta
			try {
				conn = DB.getConnection();
				
				st = conn.createStatement();
				
				rs = st.executeQuery("select * from department");
				
				while (rs.next()) {
					System.out.println(rs.getInt("Id") + "," + rs.getString("Name"));
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				DB.closeResultSet(rs);
				DB.closeStatement(st);
				DB.closeConnection();
			}
		}
	}