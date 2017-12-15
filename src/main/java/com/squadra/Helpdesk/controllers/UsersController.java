package com.squadra.Helpdesk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.squadra.Helpdesk.models.User;
import com.squadra.Helpdesk.services.UserService;

@Controller
public class UsersController {

	@Autowired
	private UserService userService;

	public UsersController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/")
	public String index() {
		List<User> user = this.userService.findAll();
		return "users/index";
	}

	@GetMapping("/create")
	public String create() {
		return null;
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id) {
		return null;
	}

	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id) {
		return null;
	}

	@PostMapping
	public String store() {
		return null;

	}

	@DeleteMapping("/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		return null;
	}
}
