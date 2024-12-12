package com.aeerotech.userinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aeerotech.userinfo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
