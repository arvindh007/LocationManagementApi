package com.myapplication.location_management_api.repository;

import com.myapplication.location_management_api.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends CrudRepository<UserEntity, Long> {
    public UserEntity findByEmailAndPassword(String email, String password);

}
