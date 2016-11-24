package com.hb.model;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GuestDaoTest {
	Logger log = Logger.getLogger(this.getClass());
	private GuestDao dao;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("~~~~");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass()");
	}
	
	@Before
	public void before(){
		dao = new GuestDao();
	}
	@After
	public void after(){
		log.debug("after()");
	}
	@Test
	public void testSelectAll() throws ClassNotFoundException, SQLException {
		List<GuestVo> list = dao.selectAll();
		assertNotNull(list);
		for(GuestVo vo:list){
			log.debug(vo);
		}
	}
	@Test
	public void testSelectOne(){
		int sabun =1111;
		GuestVo bean=dao.selectOne(sabun);
		assertNotNull(bean);
		assertEquals(sabun, bean.getSabun());
		log.debug(bean);
	}
}










