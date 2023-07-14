package abhi.sb.jwt.controllers;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abhi.sb.jwt.models.Users;
import abhi.sb.jwt.services.UserServices;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserServices userServices;
	
    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/test")
    public String test() {
        this.logger.warn("This is working message");
        return "Testing message";
    }
    
    
    @GetMapping("/users")
    public List<Users> getUsers() {
        this.logger.warn("This is getUsers()");
        return userServices.getUsers();
    }
    
    @GetMapping("/current-user")
    public String getCurrentUsers(Principal principal) {
        this.logger.warn("This is getCurrentUsers()");
        return principal.getName();
    }
}


//	http://localhost:8080/logout
	
//	http://localhost:8080/home/test
//	http://localhost:8080/home/users
//	http://localhost:8080/home/current-user

