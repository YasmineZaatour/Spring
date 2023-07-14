package yasmine.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import yasmine.mysql.entity.User;
import yasmine.mysql.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/all")
	public List<User> getAll() {
		return this.userRepository.findAll();
	}
	
	@PostMapping ("/add")
	public User addUser (@RequestBody User user ) {
		return this.userRepository.save(user);
	}

	@PutMapping ("/update")
	public User updateUser (@RequestBody User user ) {
		return this.userRepository.save(user);	
	}
	
	@DeleteMapping ("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser (@PathVariable long id ) {
		this.userRepository.deleteById(id);
		
	}

}
