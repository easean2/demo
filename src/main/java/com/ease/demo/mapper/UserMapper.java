package com.ease.demo.mapper;

import java.util.List;

import com.ease.demo.model.User;

public interface UserMapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}
