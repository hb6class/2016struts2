package com.hb.model;

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

}








