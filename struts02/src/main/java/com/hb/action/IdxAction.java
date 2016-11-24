package com.hb.action;

import com.opensymphony.xwork2.Action;

public class IdxAction implements Action {
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	@Override
	public String execute() throws Exception {
		msg = "Struts2";
		return SUCCESS;
	}

}
