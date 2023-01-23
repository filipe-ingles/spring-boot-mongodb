 package com.filipeafonso.springmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.filipeafonso.springmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}