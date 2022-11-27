package com.fullstacktutorial.usermanagementsystem.repository;

import com.fullstacktutorial.usermanagementsystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
