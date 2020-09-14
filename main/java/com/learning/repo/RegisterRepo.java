package com.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.model.User;

@Repository

public interface RegisterRepo extends JpaRepository<User,Long>{

	User save(User user);

}
