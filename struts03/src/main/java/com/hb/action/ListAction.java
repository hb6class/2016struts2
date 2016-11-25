package com.hb.action;

import java.util.List;

import com.hb.model.GuestDao;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action {
	private List list;
	public List getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		 
		list=new GuestDao().selectAll();
		return SUCCESS;
	}

}
