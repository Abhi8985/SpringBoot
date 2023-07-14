package abhi.sb.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtNewApplication.class, args);
		System.out.println("==> Jwt New Application <=="); 
	}
}
