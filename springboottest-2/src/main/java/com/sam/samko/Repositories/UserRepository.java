package com.sam.samko.Repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sam.samko.Model.User;

public interface UserRepository extends MongoRepository<User, String> {

	 Optional <User>findByEmail(String email);


}