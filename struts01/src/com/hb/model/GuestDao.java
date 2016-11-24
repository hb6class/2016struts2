package com.hb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class GuestDao {
	
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="scott";
	private String password="tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public GuestDao() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		conn=DriverManager.getConnection(url, user, password);
	}
	
	public List<GuestVo> selectAll() throws SQLException{
		List<GuestVo> list = new ArrayList<GuestVo>();
		try{
		pstmt=conn.prepareStatement("select * from guest");
		rs=pstmt.executeQuery();
		while(rs.next()){
			list.add(new GuestVo(
					rs.getInt("sabun")
					,rs.getString("name")
					,rs.getDate("nalja")
					,rs.getInt("pay")
					));
		}
		}finally {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}

	public void insertOne(int sabun, String name, int pay) throws SQLException {
		try{
		pstmt=conn.prepareStatement("insert into guest values (?,?,sysdate,?)");
		pstmt.setInt(1, sabun);
		pstmt.setString(2, name);
		pstmt.setInt(3, pay);
		pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}

	public GuestVo selectOne(int sabun) throws SQLException {
		String sql="select * from guest where sabun=?";
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			rs=pstmt.executeQuery();
			if(rs.next()){
				return new GuestVo(
						rs.getInt("sabun")
						,rs.getString("name")
						,rs.getDate("nalja")
						,rs.getInt("pay")
						);
			}	
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return null;
	}

	public void updateOne(GuestVo bean) throws SQLException {
		String sql ="update guest set name=?"
				+ ",pay=? where sabun=?";
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getPay());
			pstmt.setInt(3, bean.getSabun());
			pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}

	public void deleteOne(int sabun) throws SQLException {
		String sql ="delete from guest "
				+ "where sabun=?";
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}
}












