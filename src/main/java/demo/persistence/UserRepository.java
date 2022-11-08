package demo.persistence;

import java.util.Optional;

import com.redis.om.spring.repository.RedisDocumentRepository;

import demo.model.User;

public interface UserRepository 
		extends RedisDocumentRepository<User, Integer> {
	
	Optional<User> findByName(String name);

}
