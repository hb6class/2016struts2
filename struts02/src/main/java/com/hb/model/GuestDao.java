package com.hb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hb.sql.RowMapper;
import com.hb.sql.SqlTemplate;

public class GuestDao {

	public List selectAll() {
		String sql="select * from guest order by sabun";
		return new SqlTemplate().executeList(sql, new RowMapper() {
			
			@Override
			public List<GuestVo> rowMapper(ResultSet rs) throws SQLException {
				List<GuestVo> list = new ArrayList<GuestVo>();
				while(rs.next()){
					list.add(new GuestVo(
							rs.getInt("sabun")
							,rs.getString("name")
							,rs.getDate("nalja")
							,rs.getInt("pay")
							));
				}
				return list;
			}
		});
	}

	public GuestVo selectOne(int sabun) {
		String sql="select * from guest where sabun=?";
		Object[] obj={sabun};
		RowMapper mapper = new RowMapper() {
			
			@Override
			public List<GuestVo> rowMapper(ResultSet rs) throws SQLException {
				List<GuestVo> list = new ArrayList<GuestVo>();
				while(rs.next()){
					list.add(new GuestVo(
							rs.getInt("sabun")
							,rs.getString("name")
							,rs.getDate("nalja")
							,rs.getInt("pay")
							));
				}
				return list;
			}
		};
		return (GuestVo)new SqlTemplate().executeOne(sql, obj, mapper);
	}

	public void insertOne(GuestVo bean) {
		String sql="insert into guest values "
				+ "(?,?,sysdate,?)";
		Object[] obj={bean.getSabun()
				,bean.getName(),bean.getPay()};
		new SqlTemplate().executeUpdate(sql, obj);
	}

	public void updateOne(GuestVo bean) {
		String sql = "update guest set name=?,pay=? where sabun=?";
		Object[] obj={bean.getName(),bean.getPay(),bean.getSabun()};
		new SqlTemplate().executeUpdate(sql, obj);
	}
	

}








