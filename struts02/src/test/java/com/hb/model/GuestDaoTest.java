package com.hb.model;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

public class GuestDaoTest {
	Logger log = Logger.getLogger(this.getClass());

	@Test
	public void testSelectAll() throws ClassNotFoundException, SQLException {
		GuestDao dao = new GuestDao();
		List<GuestVo> list = dao.selectAll();
		assertNotNull(list);
		for(GuestVo vo:list){
			log.debug(vo);
		}
	}

}
