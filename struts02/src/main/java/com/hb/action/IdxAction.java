package com.hb.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;

public class IdxAction implements Action {
	Logger log = Logger.getLogger(this.getClass());
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	@Override
	public String execute() throws Exception {
		msg = "Struts2";
		log.debug(msg);
		return SUCCESS;
	}

}
