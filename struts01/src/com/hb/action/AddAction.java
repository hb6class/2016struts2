package com.hb.action;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {
	private int sabun;
	private String name;
	private int pay;
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	@Override
	public String execute() throws Exception {
		
		new GuestDao().insertOne(sabun,name,pay);
		
		return SUCCESS;
	}
	@Override
	public void validate() {
		Map<String, List<String>> map =getFieldErrors();
		Set<String> key = map.keySet();
		Iterator<String> ite = key.iterator();
		while(ite.hasNext()){
			String mapKey=ite.next();
			List<String> mapVal=map.get(mapKey);
			System.out.print(mapKey);
			System.out.println(":"+mapVal.get(0));
			mapVal.set(0, "문자는 안됩니다");
			if(mapKey.equals("pay")){
				mapVal.add("원기호 또는 콤마를 빼세요");
			}else{
				mapVal.add("숫자를 입력하세요");
			}
		}
		if(map.isEmpty()){
			if(sabun==0||"".equals(sabun)){
				addFieldError("sabun", "빈값입니다");
			}else if(sabun>9999){
				addFieldError("sabun", "4자리 수까지만 허용");			
			}
		}
	}
}
