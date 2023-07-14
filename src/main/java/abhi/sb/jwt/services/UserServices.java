package abhi.sb.jwt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import abhi.sb.jwt.models.Users;

@Service
public class UserServices {

	List<Users> store = new ArrayList<>();

	public UserServices() {
		store.add(new Users(UUID.randomUUID().toString(), "Abhi", "Abhi"));
		store.add(new Users(UUID.randomUUID().toString(), "Hari", "Hari"));
		store.add(new Users(UUID.randomUUID().toString(), "Nani", "Nani"));
	}
	
	public List<Users> getUsers() {
		return store;
	}
	
	
}
