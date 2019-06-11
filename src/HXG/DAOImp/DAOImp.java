package HXG.DAOImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.crypto.provider.RSACipher;
import com.sun.org.apache.regexp.internal.recompile;

import HXG.DAO.DAO;
import HXG.DBUtil.JDBCUtil;
import HXG.enity.User;

public class DAOImp implements DAO{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	@Override
	public boolean selectOne(User user) {
		conn = JDBCUtil.getConnection();
		String sql = "select *from tb_user where username = ? and password = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
		    rs = pstmt.executeQuery();
		    if(rs.next()) {
		    	return true;
		    }else {
		    	return false;
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}finally {
			JDBCUtil.Close(conn, pstmt, rs);
		}
	}
	@Override
	public int addUser(User user) {
		conn = JDBCUtil.getConnection();
		String sql = "insert into tb_user(username,password,phone) values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getPhone());
			int count = pstmt.executeUpdate();
		    return count;
		} catch (SQLException e) {
			return 0;
		}finally {
			JDBCUtil.Close(conn, pstmt, rs);
		}
	}

}
