package com.petpeers.petpeers.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.petpeers.dto.LoginRequest;
import com.petpeers.petpeers.repository.UserRepository;

@Service
public class UserValidation{

	@Autowired
	UserRepository userRepository;
	
	public boolean doesUserNameExist(String userName) {
		if((UserRepository.findByUserName(userName)) != null){
			return true;
		}else{
			return false;
		}
	//end of method does user exist	
	}

	public boolean validateUser(LoginRequest loginRequest){

			if(doesUserNameExist(loginRequest.getUserName())){
				if(userRepository.findByUserPassword() == loginRequest.getUserPassword()) {
					return true;
				}
			}
			
			return false;
		//end of method  validate user
	}
}
