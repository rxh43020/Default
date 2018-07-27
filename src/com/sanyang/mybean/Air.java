package com.sanyang.mybean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Air {
	 private Integer aid;//    NUMBER(4) not null,
	 @Size(min=1 ,message="姓名不能为空")
	 private String aname;//  NVARCHAR2(50),
	 @Pattern(regexp="[襄阳]+",message="出发城市必须为襄阳")
	 private String aqcity;// NVARCHAR2(50),
	 private String adcity;// NVARCHAR2(50),
	 private String ardate;// DATE,
	 private String asdate;// DATE
	 
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAqcity() {
		return aqcity;
	}
	public void setAqcity(String aqcity) {
		this.aqcity = aqcity;
	}
	public String getAdcity() {
		return adcity;
	}
	public void setAdcity(String adcity) {
		this.adcity = adcity;
	}
	public String getArdate() {
		return ardate;
	}
	public void setArdate(String ardate) {
		this.ardate = ardate;
	}
	public String getAsdate() {
		return asdate;
	}
	public void setAsdate(String asdate) {
		this.asdate = asdate;
	}
	 
}
