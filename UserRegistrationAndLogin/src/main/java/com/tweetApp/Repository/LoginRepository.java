package com.tweetApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetApp.Entity.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, String>{

}
