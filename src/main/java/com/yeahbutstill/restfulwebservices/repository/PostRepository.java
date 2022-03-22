package com.yeahbutstill.restfulwebservices.repository;

import com.yeahbutstill.restfulwebservices.domain.dao.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {


}
