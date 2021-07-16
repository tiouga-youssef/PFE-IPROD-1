package com.incidents.orchestration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.incidents.common.MapperService;

import com.incidents.entity.UserEntity;
import com.incidents.reposository.UserRepository;
import com.incidents.services.UserService;
import com.incidents.dto.UserDto;

@Service
public class UserOrchestration {
  

	@Autowired 
	UserRepository userRepository;

	@Autowired
	MapperService mapper;
	
	@Autowired 
	UserService userService; 
	
	public UserDto orch(UserDto user) {
		UserEntity userEntity=mapper.dtoToEntity(user, UserEntity.class);
		userEntity.setUserId("user test id "); 
		 UserEntity newUser = userRepository.save(userEntity);
		return user;
	}
		
	
	public UserEntity orchestration(@RequestBody  UserEntity userEntity) {

	UserDto userDto = new UserDto();
    userEntity=mapper.dtoToEntity(userDto, UserEntity.class);

	
	UserDto creatUser = userService.creatUser(userDto);
	userEntity=mapper.dtoToEntity(creatUser, UserEntity.class);
	
	return userEntity;
}
	
	
}

