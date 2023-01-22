 package com.filipeafonso.springmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.filipeafonso.springmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
