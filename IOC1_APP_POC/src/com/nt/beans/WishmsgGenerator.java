package com.nt.beans;

import java.util.Date;

public class WishmsgGenerator {
private Date date;
public Date getDate() {
		return date;
	}
public void setDate(Date date) {
		this.date = date;
	}
	//B. logic
	public String wishmsgGenerator(String name){
		int hrs=date.getHours();
		if(hrs<12)
			return "Good Morning   "+name;
		else if(hrs<16)
		return "  Good Afternoon "+name;
		else if(hrs<20)
			return "Good Evening  "+name;
		else
			return "Good Night   "+name;
	}
}
