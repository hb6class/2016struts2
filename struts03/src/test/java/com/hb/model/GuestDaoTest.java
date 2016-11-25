package com.hb.model;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class GuestDaoTest {
	Logger log = Logger.getLogger(this.getClass());
	private GuestDao dao;
	
	@Before
	public void settingDao() throws IOException{
		dao = new GuestDao();
	}
	
	@Test
	public void testSelectAll() throws SQLException{
//		assertTrue(true);
		List<GuestVo> list=dao.selectAll();
		assertNotNull(list);
		for(GuestVo vo:list){
			log.debug(vo);
		}
	}
	@Test
	public void testSelectOne() throws SQLException{
		int sabun =1111;
		GuestVo bean=dao.selectOne(sabun);
		assertNotNull(bean);
		assertEquals(sabun, bean.getSabun());
		log.debug(bean);
	}
}








