package com.hb.action;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UpdateAction extends ActionSupport implements ModelDriven<GuestVo>,Preparable {
	private GuestVo bean;
	
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
	public void prepare() throws Exception {
		bean = new GuestVo();
	}

	@Override
	public GuestVo getModel() {
		return bean;
	}

}
