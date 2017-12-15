package com.squadra.Helpdesk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squadra.Helpdesk.models.User;
import com.squadra.Helpdesk.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<User> findAll() {
		return this.repository.findAll();
	}

	@Override
	public User create(User user) {
		return null;
	}

	@Override
	public User show(Long id) {
		return this.repository.findOne(id);
	}

	@Override
	public Boolean delete(Long id) {
		return null;
		// TODO
	}

	@Override
	public Boolean update(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
