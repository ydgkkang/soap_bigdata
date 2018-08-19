package com.sscnt.soap.server.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.jboss.logging.Logger;

import com.sscnt.soap.server.model.Request;

@WebService
public interface UpdateUserService {

	@WebMethod(operationName = "updateUser", action = "https://sscnt.bigdata.com/updateUser/requst")
	String updateUser(//final String name,final String title,
			@WebParam final Request credential) throws Exception;

	
}
