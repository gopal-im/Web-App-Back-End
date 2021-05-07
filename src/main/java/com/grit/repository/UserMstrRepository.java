package com.grit.repository;

import org.springframework.data.repository.CrudRepository;

import com.grit.model.UserMstr;
public interface UserMstrRepository extends CrudRepository<UserMstr,String>{

	UserMstr findByUserid(String userid);
	UserMstr findByUsernameAndUserpwd(String userid,String pwd);
}
