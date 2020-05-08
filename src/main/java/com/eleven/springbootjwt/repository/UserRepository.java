package com.eleven.springbootjwt.repository;

import com.eleven.springbootjwt.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Eleven on 2020/5/7
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
