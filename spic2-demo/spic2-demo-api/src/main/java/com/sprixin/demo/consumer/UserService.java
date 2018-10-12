package com.sprixin.demo.consumer;

import java.util.List;

import com.sprixin.demo.model.User;

public interface UserService {

	void save(User user);

	void deleteById(Integer id);

	void update(User user);

	User findById(Integer id);

	List<User> findAll(Integer page, Integer size);

}
