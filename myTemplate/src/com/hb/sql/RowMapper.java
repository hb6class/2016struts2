package com.hb.sql;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface RowMapper {
	public abstract List rowMapper(ResultSet rs) throws SQLException;
}
