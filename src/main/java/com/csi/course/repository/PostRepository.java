package com.csi.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.csi.course.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}

