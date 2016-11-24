package com.hb.action;

import java.util.List;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action {

	private List<GuestVo> list;
	public List<GuestVo> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		list=new GuestDao().selectAll();
		return SUCCESS;
	}

}
