package com.hb.action;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UpdateAction implements ModelDriven<GuestVo>, Action {
	private GuestVo bean= new GuestVo();
	
	public GuestVo getBean() {
		return bean;
	}
	public void setBean(GuestVo bean) {
		this.bean = bean;
	}

	@Override
	public String execute() throws Exception {
		new GuestDao().updateOne(bean);
		return SUCCESS;
	}
	@Override
	public GuestVo getModel() {
		// TODO Auto-generated method stub
		return bean;
	}
	

}
