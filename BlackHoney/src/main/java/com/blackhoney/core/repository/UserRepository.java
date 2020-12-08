package com.blackhoney.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blackhoney.core.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
