package com.hb.action;

import com.hb.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class AddAction extends ActionSupport implements Preparable, ModelDriven<GuestVo> {
	private GuestVo bean;
	
	public GuestVo getBean() {
		return bean;
	}
	public void setBean(GuestVo bean) {
		this.bean = bean;
	}
	@Override
	public String execute() throws Exception {
//		Âü°í¿ë
		if(bean.getSabun()==0
				||bean.getName()==null
				||"".equals(bean.getName())
				||bean.getPay()==0){
			return INPUT;
		}
		new GuestDao().insertOne(bean);
		return SUCCESS;
	}
	public String pShow(){
		return INPUT;
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
