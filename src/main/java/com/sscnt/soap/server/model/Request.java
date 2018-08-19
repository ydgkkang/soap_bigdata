package com.sscnt.soap.server.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "RequestMapper", namespace = "https://sscnt.bigdata.com")
public class Request {

	@XmlElement(name = "userId", required = true)
	private String userId;

	@XmlElement(name = "password", required = true)
	private String password;

	@XmlElement(name = "title", required = true)
	private String title;

	@XmlElement(name = "detpJob", required = true)
	private List<RequestDeptJob> deptJob;

	@XmlElement(name = "corpNm", required = true)
	private List<RequestCorpNm> corpNm;

	@XmlElement(name = "detpNm", required = true)
	private List<UpdateDeptNm> deptNm;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<RequestDeptJob> getDeptJob() {
		return deptJob;
	}

	public void setDeptJob(List<RequestDeptJob> deptJob) {
		this.deptJob = deptJob;
	}
	
	public List<UpdateDeptNm> getDeptNm() {
		return deptNm;
	}

	public void setDeptNm(List<UpdateDeptNm> deptNm) {
		this.deptNm = deptNm;
	}
	
	public List<RequestCorpNm> getCorpNm() {
		return corpNm;
	}

	public void setCorpNm(List<RequestCorpNm> corpNm) {
		this.corpNm = corpNm;
	}	
	
	
	@Override
	public String toString() {
		return "RequestMapper [userId=" + userId + ", password="
				+ password + ", deptJob="+deptJob+", deptNm="+deptNm+", corpNm="+corpNm+"]";
	}

}
