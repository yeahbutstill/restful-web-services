package com.yeahbutstill.restfulwebservices.domain.dao;

import com.yeahbutstill.restfulwebservices.beans.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static Integer usersCount = 3;

    static {
        users.add(new User(1, "Dani", new Date()));
        users.add(new User(2, "Maya", new Date()));
        users.add(new User(3, "Naimi", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(Integer id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
