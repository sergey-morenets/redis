package demo.web;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import demo.model.User;
import demo.persistence.UserRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

	private final UserRepository repository;

	@PostMapping
	public void save(@RequestBody User user) {
		repository.save(user);
	}

	@GetMapping
	public Optional<User> find(@RequestParam("name") String name) {
		return repository.findByName("test");
	}

}
