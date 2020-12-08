package com.blackhoney.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blackhoney.core.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
