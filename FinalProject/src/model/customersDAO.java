package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class customersDAO {
	
	int cnt =0;
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	
	public void conn() {
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String dbid = "hr";
				String dbpw = "hr";
				
				conn = DriverManager.getConnection(url,dbid,dbpw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(psmt != null) {
					psmt.close();
			}if(conn != null) {
				conn.close();
			}
			
			}catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	public int join(String id, String pw, String name, String tel) {
		try {
			conn();
			String sql = "insert into customers values(cusNum.NEXTVAL,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, tel);
			
			cnt = psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return cnt;
		
	}

}
