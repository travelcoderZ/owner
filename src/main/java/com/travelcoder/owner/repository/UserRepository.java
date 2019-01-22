package com.travelcoder.owner.repository;

import com.travelcoder.owner.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
