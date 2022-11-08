package demo.model;

import org.springframework.data.annotation.Id;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Document("users")
public class User {

	@Id
	private String id;

	@Indexed
	private String name;

	private int age;

}
