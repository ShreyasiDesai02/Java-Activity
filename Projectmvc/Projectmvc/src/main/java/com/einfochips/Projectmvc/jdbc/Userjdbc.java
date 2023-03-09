package com.einfochips.Projectmvc.jdbc;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.einfochips.Projectmvc.model.User;

@Repository
public class Userjdbc {
	public List<User> getAllUsers(){
		List<User> li = new ArrayList<User>();
		li.add(new User("shreyasi","shree@.com","pune","1234456"));
		li.add(new User("shruti","shruti@.com","pune","67890987"));
		li.add(new User("vanita","vatnita@.com","karad","567890"));
		return li;
	}
}
