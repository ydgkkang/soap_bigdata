package com.sscnt.soap.server.dao;

import java.util.List;

import com.sscnt.soap.server.model.Request;
import com.sscnt.soap.server.model.Update;
 
public class UpdateUserDao {
	
	 
	public interface UpdateMapper {
	 
	    public int udpateUserInfo(Request credential) throws Exception;
	    
	}

}
