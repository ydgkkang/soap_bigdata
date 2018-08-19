package com.sscnt.soap.server.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DeptNm", namespace = "https://sscnt.bigdata.com")
public class UpdateDeptNm {

	@XmlElement(name = "userId", required = true)
	private String userId;

	@XmlElement(name = "password", required = true)
	private String password;

	@XmlElement(name = "employeeNo", required = true)
	private String employeeNo;

	
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

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	@Override
	public String toString() {
		return "DeptNm [userId=" + userId + ", password="
				+ password + ", employeeNo="+employeeNo+"]";
	}

}
