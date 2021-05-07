package com.grit.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grit.model.UserMstr;
import com.grit.repository.UserMstrRepository;
@Service
public class UserMstrService {
@Autowired
UserMstrRepository userMstrRepository;

public UserMstr findById(String userid) {
	return userMstrRepository.findByUserid(userid);
}

public UserMstr userlogin(String userid,String pwd) {
	return userMstrRepository.findByUsernameAndUserpwd(userid,pwd);
}
}
