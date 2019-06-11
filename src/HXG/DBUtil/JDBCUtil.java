package HXG.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	
	public static Connection getConnection() {
		
		
		try {
			//加载数据库驱动
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//连接数据库
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=db_blog","sa","990806");
			
			return conn;
		} catch (ClassNotFoundException e) {
			return null;
		}catch(SQLException e) {
			return null;
		}
	}
	
	public static void Close(Connection conn,PreparedStatement pstmt,ResultSet rs) {
		if(rs!=null) {try{rs.close();}catch(Exception e) {}}
		if(pstmt!=null) {try{pstmt.close();}catch(Exception e) {}}
		if(conn!=null) {try{conn.close();}catch(Exception e) {}}
	}
	
	public static void Close(Connection conn,PreparedStatement pstmt) {
		if(pstmt!=null) {try{pstmt.close();}catch(Exception e) {}}
		if(conn!=null) {try{conn.close();}catch(Exception e) {}}
	}
}







