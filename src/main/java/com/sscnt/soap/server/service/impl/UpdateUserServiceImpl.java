package com.sscnt.soap.server.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.apache.commons.logging.impl.SimpleLog;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.sscnt.soap.server.model.Update;
import com.sscnt.soap.server.dao.UpdateUserDao.UpdateMapper;
import com.sscnt.soap.server.model.Request;
import com.sscnt.soap.server.service.UpdateUserService;

@WebService(endpointInterface = "com.sscnt.soap.server.service.UpdateUserService")
public class UpdateUserServiceImpl implements UpdateUserService {
    
	@Autowired
    private UpdateMapper mapper;
    
	static Logger logger = Logger.getLogger(SimpleLog.class);
	@Override
	public String updateUser(//final String name,final String title, 
			final Request credential) throws Exception {
		
		logger.debug(credential + "aaaaa");
			
		int cnt = mapper.udpateUserInfo(credential); 
		logger.debug(credential + "aaaaa");
		return "update from " + credential;
		
	}

}
