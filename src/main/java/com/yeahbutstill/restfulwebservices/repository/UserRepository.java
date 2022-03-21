package com.yeahbutstill.restfulwebservices.repository;

import com.yeahbutstill.restfulwebservices.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
