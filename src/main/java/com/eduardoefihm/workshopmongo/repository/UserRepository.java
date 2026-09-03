package com.eduardoefihm.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.eduardoefihm.workshopmongo.domain.User;

public interface UserRepository	extends MongoRepository<User, String> {
	
}
