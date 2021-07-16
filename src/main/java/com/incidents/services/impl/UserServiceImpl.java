package com.incidents.services.impl;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.incidents.orchestration.UserOrchestration;
import com.incidents.reposository.UserRepository;
import com.incidents.services.UserService;
import com.incidents.dto.UserDto;



@Service
public class UserServiceImpl implements UserService {
	
	
	
	@Autowired 
	UserRepository userRepository;

	
	@Autowired
	UserOrchestration userOrchestration;
	
	@Override
	public UserDto creatUser(UserDto user) {
		user=userOrchestration.orch(user);
		
	return user;
	}
	
	

	

}
