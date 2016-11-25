package com.hb.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;






import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class GuestDao {
	private SqlMapClient sqlMap;
	
	public GuestDao() throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		sqlMap=SqlMapClientBuilder.buildSqlMapClient(reader);
	}

	public List selectAll() throws SQLException {
		List list=sqlMap.queryForList("selectAll");
		return list;
	}

}
